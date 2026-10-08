/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tuproyecto.imc.main;

import com.tuproyecto.imc.controller.IMCController;
import com.tuproyecto.imc.view.IMCView;

/**
 *
 * @author Joaquin Torrubia Oria
 */
public class Main {

    public static void main(String[] args) {

        IMCView vista = new IMCView(); // crea la ventana vista
        new IMCController(vista); // crea el controlador y le pasa la vista
        vista.setVisible(true); // para que la ventana sea visible

    }

}
