/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ejercicio;

import java.util.Scanner;

/**
 *
 * @author cvveg
 */
public class Ejercicio {
    public Ejercicio() {
    }
    public  double multiplicar() {
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        return numero1 * numero2;
    }
}
