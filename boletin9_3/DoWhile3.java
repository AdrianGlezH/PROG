package boletin9_3;

import javax.swing.JOptionPane;

public class DoWhile3 {
    
    public void bucleWhile(){
        int num1, num2;
        do{
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número positivo"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número positivo"));
        }while(num1<0||num2<0);
        JOptionPane.showMessageDialog(null,"El área del rectángulo es : "+(num1*num2));
    }
}
