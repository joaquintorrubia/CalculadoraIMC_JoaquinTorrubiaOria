/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuproyecto.imc.controller;

import com.tuproyecto.imc.model.CalculadoraIMC;
import com.tuproyecto.imc.view.IMCView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Joaquin Torrubia Oria
 */
public class IMCController {

    private final JTextField txtPeso;
    private final JTextField txtAltura;
    private final JLabel lblResultado;
    private final JLabel lblClasificacion;

    private final CalculadoraIMC calculadora = new CalculadoraIMC();

    public IMCController(IMCView vista) {

        this.txtPeso = vista.getTxtPeso();
        this.txtAltura = vista.getTxtAltura();
        this.lblResultado = vista.getLblResultado();
        this.lblClasificacion = vista.getLblClasificacion();

        vista.setControlador(this);

    }

    public void calcularIMC() {

        String textoPeso = txtPeso.getText().trim().replace(',', '.');
        String textoAltura = txtAltura.getText().trim().replace(',', '.');

        double peso;
        double altura;

        try {

            peso = Double.parseDouble(textoPeso);
            altura = Double.parseDouble(textoAltura);
        } catch (NumberFormatException nfe) {
            lblClasificacion.setForeground(Color.RED);
            lblClasificacion.setText("Error: Introduce solo números válidos");
            return;
        }

        double imc = calculadora.calcular(peso, altura);
        String clasificacion = calculadora.clasificar(imc);

        lblResultado.setText(String.format("Tu IMC es: %.2f", imc));
        lblClasificacion.setText("Clasificación: " + clasificacion);
        
        
         switch (clasificacion) {
            case "Peso Normal":
                lblClasificacion.setForeground(Color.GREEN);
                break;
            case "Bajo Peso":
            case "Sobrepeso":
                lblClasificacion.setForeground(Color.ORANGE);        
                break;
            default: // Obesidad
                lblClasificacion.setForeground(Color.RED);            
         }

    }
}
