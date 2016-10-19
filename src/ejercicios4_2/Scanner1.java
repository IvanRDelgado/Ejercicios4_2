/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4_2;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        System.out.println(" El numero ingresado es"+(double)a);
        
    }
}