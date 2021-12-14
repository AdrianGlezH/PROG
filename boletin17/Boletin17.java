package boletin17;

import javax.swing.JOptionPane;

public class Boletin17 {

    public static void main(String[] args) {
        
        float notaes1, notaes2, notaprac, notafinal;
        int cualglob, porcbol, cond;
        
        do{
            
        
        
        notaes1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de el primer exámen teórico"));
        notaes2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de el segundo exámen teórico"));
        notaprac = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de el exámen práctico"));
        porcbol = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el porcentaje de boletines entregado"));
        
        if(porcbol<=70)
            cualglob=0;
        else if(porcbol>70&&porcbol<90)
            cualglob=1;
        else
            cualglob=2;
        
        notafinal =(float) ((notaes1+notaes2)/2*0.4+(notaprac*0.4)+cualglob);
        
        JOptionPane.showMessageDialog(null,"Su nota es : "+notafinal);
        cond = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere calcular otra nota?, si es así pulse 1"));
        
        }while(cond==1);
        JOptionPane.showMessageDialog(null,"Se ha terminado el programa");
    }
}
