package boletin9_2;

import javax.swing.JOptionPane;

public class DoWhile {
    
    /*public void BucleDoWhile(){
        int num1 ,num2;
        do{
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre el 10 y el 90"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número entre el 10 y el 90"));    
        }while((num1<10||num1>90)||(num2<10||num2>90));
        System.out.println("La suma de "+num1+" y de "+num2+" es : "+(num1+num2)+"\nEl producto de "+num1+" y de "+num2+" es : "+(num1*num2));
    }*/
    public void ejercicio2(){
        int j = 10;
        int suma = 0;
        double producto = 1;
        do{
            suma = suma+j;
            producto = (producto*j);
            j++;
        }while(j<90);
        System.out.println("La suma de todos los números comprendidos entre 10 y 90 es = "+suma+"\nY su producto es "+producto);
    }
}
