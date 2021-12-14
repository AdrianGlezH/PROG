/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

import java.util.Scanner;

/**
 * @author dam1
 */


public class Ejercicio7_3 {
    /**
     * @param num es un
     */
    int num;
    Scanner sc = new Scanner(System.in);


    public void mostrarSignos() {
        System.out.println("introduzca un número entero");
        num = sc.nextInt();

        if (num == 0) {
            System.out.println("0");
        } else if (num > 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
