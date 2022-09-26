/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_mvc_ej2;

import controlador.controlador;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author jvargas
 */
public class Java_MVC_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        modelo _modelo = new modelo();
        vista _vista = new vista();
        
        controlador _controlador = new controlador(_vista, _modelo);
        _controlador.iniciar();
        _vista.setVisible(true);
    }
    
}
