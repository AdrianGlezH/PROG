
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
    float millas;
    final int EQUIVALENCIA=1852;
    Scanner sc=new Scanner(System.in);
    System.out.println("La cantidad de millas a convertir es =");
    millas=sc.nextFloat();
    System.out.println(millas+" millas son "+(millas*EQUIVALENCIA)+" metros");
    }
    
}
