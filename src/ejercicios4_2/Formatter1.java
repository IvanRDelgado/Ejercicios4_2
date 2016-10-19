/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_2;

import java.util.Formatter;

public class Formatter1 {

    public static void main(String[] args) {
        int numero = 1000;
        Formatter formato1 = new Formatter();
        System.out.println("El valor en hexadecimal de "+numero+" es "+ formato1.format("%x", numero));
    }
}
