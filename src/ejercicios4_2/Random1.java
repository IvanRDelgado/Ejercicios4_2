/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_2;

import java.util.Random;

public class Random1 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {

            System.out.println("Numero tipo entero aleatorio: " + aleatorio.nextInt(10));
        }
    }
}
