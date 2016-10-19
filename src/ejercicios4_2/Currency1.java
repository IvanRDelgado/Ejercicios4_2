/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_2;

import java.util.Currency;

public class Currency1 {

    public static void main(String[] args) {
        String currencyCode = "COP";
        Currency A = Currency.getInstance(currencyCode);
        System.out.println("Moneda Colombiana: " + A.getCurrencyCode());
    }

}
