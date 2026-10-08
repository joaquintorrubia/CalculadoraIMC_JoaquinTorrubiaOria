package com.tuproyecto.imc.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaquin Torrubia Oria
 */
public class CalculadoraIMC {
    // formula 
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
    //Segun el imc devolvera la clasificacion
    public String clasificar(double imc) {
    String clasificacion;

    if (imc < 18.5) {
        clasificacion = "Bajo Peso";
    } else if (imc < 25.0) {
        clasificacion = "Peso Normal";
    } else if (imc < 30.0) {
        clasificacion = "Sobrepeso";
    } else {
        clasificacion = "Obesidad";
    }

    return clasificacion;
}
}
