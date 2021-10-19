package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
    int num1, num2, suma, resta, producto, cociente;
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca el primer número entero :");
    num1=sc.nextInt();
    System.out.println("Introduzca el segundo número entero :");
    num2=sc.nextInt();
    suma=num1+num2;
    resta=num1-num2;
    producto=num1*num2;
    cociente=num1/num2;
    System.out.println("La suma de "+num1+" y "+num2+" es = "+suma);
    System.out.println("La resta de "+num1+" y "+num2+" es = "+resta);
    System.out.println("El producto de "+num1+" y "+num2+" es = "+producto);
    System.out.println("La división de "+num1+" y "+num2+" da = "+cociente);

    }
    
}
