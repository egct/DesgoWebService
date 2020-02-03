/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.desgo.controlador;

import ec.com.desgo.modelo.*;
import java.util.Random;

/**
 *
 * @author egct
 */
public class Login {
    int id;
    String pwd;
    String msg;
    String user;
    Random r = new Random();
    int valorDado = r.nextInt(6000)+1;  // Entre 0 y 5, más 1.
    String hash;
    LoginDAO loginDAO=new LoginDAO();
            

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getValorDado() {
        return valorDado;
    }

    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
}
