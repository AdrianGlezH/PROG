
package boletin2_3;

import java.util.Scanner;


public class Boletin2_3 {

    public static void main(String[] args) {
    int euros;
    float relacion, dolar;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("La cantidad de euros a convertir es :");
    euros=sc.nextInt();
    System.out.println("la relación euro-dolar es :");
    relacion=sc.nextFloat();
    dolar = euros*relacion;
    System.out.println(euros+" equivale a "+dolar+" dolares");
    }
    
}
