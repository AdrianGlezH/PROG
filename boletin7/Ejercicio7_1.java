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
public class Ejercicio7_1 {


    public void sacarNumeroPositivo() {
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        numero = sc.nextDouble();

        if (numero >= 0) {
            System.out.println(numero + "es positivo");
        }

    }


}


