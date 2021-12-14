package boletin9_4;

import javax.swing.JOptionPane;

public class BucleMultiplicar {
    
    public void multiplicar(){
    int num;
    do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        JOptionPane.showMessageDialog(null,"La tabla de multiplicar del "+num+" es : \n1 x "+num+" = "+(num*1)+"\n2 x "+num+" = "+(num*2)+"\n3 x "+num+" = "+(num*3)+"\n4 x "+num+" = "+(num*4)+"\n5 x "+num+" = "+(num*5)+"\n6 x "+num+" = "+(num*6)+"\n7 x "+num+" = "+(num*7)+"\n8 x "+num+" = "+(num*8)+"\n9 x "+num+" = "+(num*9)+"\n10 x "+num+" = "+(num*10));
    }while(num<0|num>0);
    JOptionPane.showMessageDialog(null,"Se ha salido del bucle");
}
    
}
