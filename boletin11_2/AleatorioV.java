package boletin11_2;

import javax.swing.JOptionPane;

public class AleatorioV {
    
    public void random(){
        float j =0, intentos = 0, num2 = 0;
        float num =(float) (Math.random()*10);
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("J1 introduzca un número aleatorio"));
            intentos = Integer.parseInt(JOptionPane.showInputDialog("J1 introduzca el máximo de intentos para adivinar"));
            }while(num<1||num>50);
        JOptionPane.showMessageDialog(null,"J2 intenta adivinar el número dentro de los intentos dados");
        do{
            num2 = Integer.parseInt(JOptionPane.showInputDialog("J2 prueba a adivinar, intentos restantes: "+(intentos-j)));
            if(num==num2){
                j++;
            }
            else if(num2>num){
                JOptionPane.showMessageDialog(null,"El número es menor que "+num2);
                j++;
            }
            else{
                JOptionPane.showMessageDialog(null,"El número es mayor que "+num2);
                j++;
            }    
        }while(num2!=num&&j<intentos);
        if(num==num2){
            JOptionPane.showMessageDialog(null,"El J2 ha ganado");
            }
        else{
            JOptionPane.showMessageDialog(null,"El J1 ha ganado");
        }
    }
    
}
