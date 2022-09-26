/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author jvargas
 */
public class controlador implements ActionListener{
    
    private vista _vista;
    private modelo _modelo;
    
    public controlador(vista _vista, modelo _modelo) {
    
        this._vista = _vista;
        this._modelo = _modelo;
        this._vista.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar() {
        _vista.setTitle("MVC Multiplicar");
        _vista.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        _modelo.setNumeroUno(Integer.parseInt(_vista.txtNumeroUno.getText()));
        _modelo.setNumeroDos(Integer.parseInt(_vista.txtNumeroDos.getText()));
        _modelo.multiplicar();
        _vista.txtResultado.setText(String.valueOf(_modelo.getResultado()));
    }
    
}
