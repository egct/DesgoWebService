$(document).ready(function(){
        $('#bt_add').click(function(){
                agregar();
        });
        $('#bt_del').click(function(){
            console.log(id_fila_selected);
                eliminar(id_fila_selected);
        });
        $('#bt_delall').click(function(){
                eliminarTodasFilas();
        });
        $('#bt_adCC').click(function(){
                agregarEC();
        });
        $('#bt_delCC').click(function(){
            console.log(id_fila_selectedCC);
                eliminarEC(id_fila_selectedCC);
        });
        $('#bt_delallCC').click(function(){
                eliminarTodasFilasEC();
        });
        

});
var cont=0;
var id_fila_selected=[];
var contCC=0;
var id_fila_selectedCC=[];

function agregar(){
        cont++;
        if(cont<=200)
        {
        var fila='<tr style="color: black;" class="selected" id="fila'+cont+'" onclick="seleccionar(this.id);"><td data-label="N">'+cont+'</td>\n\
        <td data-label="Coopropietarios" style="height:30px"><input style="background: inherit;text-align: center;border: 0;float: right;"></td>\n\
        <td data-label="Numero de identificacion" style="height:30px"><input style="background: inherit;text-align: center;border: 0;float: right"></td>\n\
        <td data-label="Porcentaje (propiedad)" style="height:30px"><input style="background: inherit;text-align: center;border: 0;float: right"></td>\n\
        <td data-label="Alicuota" style="height:30px"><input style="background: inherit;text-align: center;border: 0;float: right"></td>\n\
        <td data-label="Fecha de escritura" style="height:30px"><input style="background: inherit;text-align: center;border: 0;float: right"></td>\n\
        <td data-label="Fecha de Inscripcion" style="height:30px"><input style="background: inherit;text-align: center;border: 0;float: right"></td>\n\
        </tr>';
        $('#tabla').append(fila);
        reordenar();
        }
}

function seleccionar(id_fila){
        if($('#'+id_fila).hasClass('seleccionada')){
                $('#'+id_fila).removeClass('seleccionada');
        }
        else{
                $('#'+id_fila).addClass('seleccionada');
        }
        //2702id_fila_selected=id_fila;
        id_fila_selected.push(id_fila);
}

function eliminar(id_fila){
        /*$('#'+id_fila).remove();
        reordenar();*/
        for(var i=0; i<id_fila.length; i++){
                $('#'+id_fila[i]).remove();
                console.log("se elimino>"+id_fila[i]);
        }
        reordenar();
}

function reordenar(){
        var num=1;
        $('#tabla tbody tr').each(function(){
                $(this).find('td').eq(0).text(num);
                num++;
        });
}
function eliminarTodasFilas(){
    $('#tabla tbody tr').each(function(){
                $(this).remove();
        });

}

function agregarEC(){
    console.log("si funca");
    contCC++;
        if(contCC<=200)
        {
        var fila='<tr class="selected" id="fila'+contCC+'" onclick="seleccionarEC(this.id);"><td data-label="N" style="height:30px; color:black;">'+contCC+'</td>\n\
        <td data-label="N Bloque" style="height:30px"><input></td>\n\
        <td data-label="N Piso" style="height:30px"><input></td>\n\
        <td data-label="Unidad Constructiva" style="height:30px"><input></td>\n\
        <td data-label="Estructura" style="height:190px"><div><br><br><label>Columnas:</label><select name="clasColumna"><option>No tiene</option><option>Acero</option><option>Ca&ntilde;a</option><option>Hierro</option><option>Hormig&oacute;n armado</option><option>Madera com&uacute;n</option><option>Mixto(Metal y Hormig&oacute;n)</option><option>Pilotaje de hormig&oacute;n armado</option></select><br><br><label>Viga:</label><select name="clasViga"><option>No tiene</option><option>Acero</option><option>Ca&ntilde;a</option><option>Hierro</option></select><br><br><label>Pared:</label><select name="clasPared"><option>No tiene</option><option>Bahareque</option><option>Bloque</option><option>Ca&ntilde;</option><option>Ladrillo</option><option>Ferro Cemento</option><option>Gypsum</option><option>Prefabricado Hormig&oacute;n simple</option><option>Madera com&uacute;n</option><option>Madera procesada fina</option><option>Malla</option><option>Zinc</option><option>Lona</option><option>Piedra</option></select><br><br><label>Entrepiso:</label><select name="clasEntrepiso"><option>No tiene</option><option>Acero Hormig&oacute;n</option><option>Hierro - Hormig&oacute;n</option><option>Losa Hormig&oacute;n armado</option><option>Madera Hormig&oacute;n</option><option>Madera com&uacute;n</option><option>Madera procesada fina</option></select></div><br></td>\n\
        <td data-label="Cubierta" style="height:80px"><div><br><br><select name="clasCubierta"><option>No tiene</option><option>Acero</option><option>Ca&ntilde;a</option><option>Hierro</option><option>Losa Hormig&oacute;n armado</option><option>Madera com&uacute;n</option><option>Madera procesada fina</option></select></div></td>\n\
        <td data-label="Acabados" style="height:300px"><br><br><div><label>Piso:</label><select name="clasAPiso"><option>No tiene</option><option>Adoqu&iacute;n</option><option>Alfombra</option><option>Cer&aacute;mica</option><option>C&eacute;sped sint&eacute;tico</option><option>Duela procesada</option><option>En cementado</option><option>Flotante</option><option>Gres</option><option>L&aacute;minas de tol carrujado</option><option>Madera com&uacute;n</option><option>M&aacute;rmol</option><option>Marmolina</option><option>Parquet</option><option>Pintura de alto tr&aacute;fico</option><option>Porcelanato</option><option>Tab&oacute;n</option><option>Vinil</option></select><br><br><label>Puertas:</label><select name="clasAPuertas"><option>No tiene</option><option>Aluminio - Vidrio</option><option>Hierro</option><option>Madera panelada</option><option>Madera tamborada</option><option>Met&aacute;lica enrollable</option><option>Pl&aacute;stico preformado</option><option>Tol</option><option>Vidrio templado</option><option>Ca&ntilde;a</option><option>Malla</option></select><br><br><label>Ventana:</label><select name="clasAVentana"><option>No tiene</option><option>Aluminio</option><option>Ca&ntilde;a</option><option>Hierro</option><option>Madera Com&uacuten;</option><option>Madera procesada fina</option><option>Pl&aacute;stico preformado</option></select><br><br><label>Revestimiento Pared:</label><select name="clasARPared"><option>No tiene</option><option>Calciminas</option><option>Caucho</option><option>Esmalte</option><option>Graniplast</option><option>Alucobond</option><option>Cer&aacute;mica</option><option>Fachaleta</option><option>Laca</option></select><br><br><label>Revestimiento Cubierta:</label><select name="clasARCubierta"><option>No tiene</option><option>Arena cemento</option><option>Asbesto cemento</option><option>Cady paja</option><option>Cer&aacute;mica</option><option>Chova</option><option>Ferro cemento</option><option>Madera ladrillo</option><option>Policarbonato</option><option>Teja ordinaria</option><option>Teja vidriada</option><option>Tejuelo</option><option>Zinc</option><option>Eternit</option></select><br><br><label>Tumbado:</label><select name="clasATumbado"><option>No tiene</option><option>Ca&ntilde;a enlucida</option><option>Fibra mineral</option><option>Gypsum</option><option>Madera procesada fina</option><option>Madera Triplex</option><option>Malla enlucida</option></select><br><br><label>Energ&iacute;a El&eacute;ctrica proviene:</label><select name="clasAEElectrica"><option>No tiene</option><option>Red de empresa El&eacute;ctrica de servicio p&uacute;blico</option><option>Panel solar</option><option>Generador de luz(Planta el&eacute;ctrica)</option><option>Otro</option></select><br><br><label>Eliminaci&oacute;n de excretas:</label><select name="clasAEExcretas"><option>No tiene</option><option>Conectado a red p&uacute;blica de alcantarillado</option><option>Conectado a pozo s&eacute;ptico</option><option>Conectado a pozo ciego</option><option>Con descarga directa al mar, rio, lago o quebrada</option><option>Letrina</option></select></div></td>\n\
        <td data-label="Tipo de Acabado" style="height:30px"><input></td>\n\
        <td data-label="Uso de la Construcci&oacute;n" style="height:30px"><input></td>\n\
        </tr>';
        $('#tablaCC').append(fila);
        reordenarEC();
        }
}

function eliminarEC(id_fila){
        /*$('#'+id_fila).remove();
        reordenar();*/
        for(var i=0; i<id_fila.length; i++){
                $('#'+id_fila[i]).remove();
                console.log("se elimino>"+id_fila[i]);
        }
        reordenarEC();
}
function seleccionarEC(id_fila){
        if($('#'+id_fila).hasClass('seleccionada')){
                $('#'+id_fila).removeClass('seleccionada');
        }
        else{
                $('#'+id_fila).addClass('seleccionada');
        }
        //2702id_fila_selected=id_fila;
        id_fila_selectedCC.push(id_fila);
}
function reordenarEC(){
        var num=1;
        $('#tablaCC tbody tr').each(function(){
                $(this).find('td').eq(0).text(num);
                num++;
        });
}
function eliminarTodasFilasEC(){
    $('#tablaCC tbody tr').each(function(){
                $(this).remove();
        });

}
