/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_2;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Date;

public class Locale1 {

    public static void main(String[] args) {
        Date fecha = new Date();
        DateFormat dfColombia = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ES", "COL"));
        DateFormat dfUnitedStates = DateFormat.getDateInstance(DateFormat.LONG, new Locale("US", "USA"));
        DateFormat dfChina = DateFormat.getDateInstance(DateFormat.LONG, new Locale("CN", "CHN"));
        System.out.println("Fecha en Colombia: " + dfColombia.format(fecha));
        System.out.println("Fecha en Estados Unidos: " + dfUnitedStates.format(fecha));
        System.out.println("Feha en China: " + dfChina.format(fecha));
    }
}
