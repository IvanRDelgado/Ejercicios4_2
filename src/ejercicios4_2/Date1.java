/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_2;

import java.util.Date;

public class Date1 {

    public static void main(String[] args) {
        Date fecha1 = new Date(93, 03, 15, 11, 56, 26);
        Date fecha2 = new Date(116, 10, 24, 11, 56, 26);
        System.out.println("Fecha de nacimiento: " + fecha1);
        System.out.println("Fecha actual" + fecha2);
        System.out.println("Dias de vida: " + (fecha2.getTime() - fecha1.getTime()) / (3600000 * 24));
        System.out.println("Años de vida: " + (fecha2.getTime() - fecha1.getTime()) / ((long) 3600000 * 24 * 12 * 30));
    }
}
