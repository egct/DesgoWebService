/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.controlador;

import ec.com.desgo.modelo.FormService;
import ec.com.desgo.modelo.UserService;
import ec.com.desgo.servicios.Formulario;
import ec.com.desgo.servicios.IdentificacionUF;
import ec.com.desgo.servicios.Persona;
import ec.com.desgo.servicios.TipoUsuario;
import ec.com.desgo.servicios.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author egct
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     UserService userS=new UserService();
    String acceso="";
    
    User user=new User();
    User useraux=null;
    TipoUsuario tipou=new TipoUsuario();
    Persona persona = new Persona();
    /*********Formulario*************/
    Formulario form=new Formulario();
    FormService formS=new FormService();
        //partes
        /***/
        
        //Direccion_DDPLote direccion_DDPLote=new Direccion_DDPLote();
        IdentificacionUF identificacionUF=new IdentificacionUF();
        /**/
    /**********************/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String action=request.getParameter("action");
        switch(action){
            case "Login":  
                useraux=null;
                user.setUSUARIOUSUARIO(request.getParameter("username"));
                user.setCONTRASENIAUSUARIO(request.getParameter("pass"));
                try{
                    useraux=userS.login(user.getUSUARIOUSUARIO(), user.getCONTRASENIAUSUARIO());
                    switch(useraux.getTipoUsuario().getNIVELTIPOUSUARIO()){
                     case "Administrador":
                            acceso="menuAdministrador.jsp?idUser="+useraux.getIDUSUARIO()+"&name="+useraux.getUSUARIOUSUARIO()+"&empresa="+useraux.getEMPRESAUSUARIO();                        
                            break;
                     case "Visualizador":
                            acceso="menuUsuario.jsp?idUser="+useraux.getIDUSUARIO()+"&name="+useraux.getUSUARIOUSUARIO()+"&empresa="+useraux.getEMPRESAUSUARIO();
                            break;
                     case "Gestor":
                            acceso="menuGestor.jsp?idUser="+useraux.getIDUSUARIO()+"&name="+useraux.getUSUARIOUSUARIO()+"&empresa="+useraux.getEMPRESAUSUARIO();
                            break;
                    }
                }catch(Exception e){
                    acceso="loginerror.jsp";
                }
                break;
            case "Guardar":
                
                user.setUSUARIOUSUARIO(request.getParameter("R_user"));
                user.setCONTRASENIAUSUARIO(request.getParameter("R_pass"));
                tipou.setNIVELTIPOUSUARIO("Visualizador");
                user.setTipoUsuario(tipou);
                persona.setPNOMBREPERSONA(request.getParameter("R_Pnombre"));
                persona.setSNOMBREPERSONA(request.getParameter("R_Snombre"));
                persona.setPAPELLIDOPERSONA(request.getParameter("R_Papellido"));
                persona.setSAPELLIDOPERSONA(request.getParameter("R_Sapellido"));
                persona.setTELEFONOPERSONA(request.getParameter("R_telefono"));
                persona.setCORREOPERSONA(request.getParameter("R_email"));
                persona.setCARGOPERSONA(request.getParameter("R_cargo"));
                persona.setPROFESIONPERSONA(request.getParameter("R_profesion"));
                persona.setCEDULAPERSONA(request.getParameter("R_cedula"));
                persona.setFOTOPERSONA(request.getParameter("R_foto"));
                user.setPersona(persona);
                user.setEMPRESAUSUARIO(request.getParameter("R_empresa"));
                
                userS.registrarUser(user);
                              
                acceso="menuAdministrador.jsp?idUser="+request.getParameter("idUser")+"&name="+request.getParameter("name")+"&empresa="+request.getParameter("empresa");        
                break;
            case "Formulario":
                
                identificacionUF.setCLAVECATASTRALANTIGUOIULOTE("123");
                identificacionUF.setCLAVECATASTRALNUEVOIULOTE("123");
                identificacionUF.setNUMEROPREDIOIULOTE("123");
                
                form.setIdentificacionUF(identificacionUF);
                if(formS.registrarFormulario(form, user)){
                    acceso="menu.jsp?idUser="+useraux.getIDUSUARIO()+"&name="+useraux.getUSUARIOUSUARIO()+"&empresa="+useraux.getEMPRESAUSUARIO();                    
                }
                break;
                
       
        
    }
         RequestDispatcher dispatcher=request.getRequestDispatcher(acceso);
        dispatcher.forward(request, response);   
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
