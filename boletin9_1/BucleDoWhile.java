
package boletin9_1;

import javax.swing.JOptionPane;

public class BucleDoWhile {

    public void while1(){
        int i = 0, j = 0, k = 0, h = 0,num = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
            if(num < 0)
                i++;
            else if(num>0)
                j++;
            else
                k++;
            h++;
        }while(h<=9);
        System.out.println("Ha intoducido " + i + " números negativos, " + j + " números positivos y " + k + " ceros.");
    }
}
