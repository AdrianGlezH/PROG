package boletin9_5;

import javax.swing.JOptionPane;

public class BucleSueldo {
    
    public void Sueldo(){
        int j = 0;
        int k = 0;
        int h = 0;
        int sueldo = 0;
        do{
            do{
                sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su sueldo"));
            }while(sueldo<0);
            if(sueldo<1000){
                j++;
                h++;
            }
            else if(sueldo <= 1000||sueldo >= 1750){
                h++;
            }
            else {
                k++;
                h++;
            }
        }while(sueldo>0);
        JOptionPane.showMessageDialog(null,"El número de trabajadores que cobran menos de 1000€ es : "+j+"\nEl número de trabajadores que cobran entre 1000 y 1750€ es : "+k+"\nEl porcentaje de personas que cobran menos de 1000€ es : "+(j*100/h)+"%");
    }
}