/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Consumo {
    Scanner sc = new Scanner(System.in);
    //atributos
    private double km;
    private double litros;
    private double vMed;
    private double pGas;
    int euros;
    double consumoMedio;
    //constructor por defecto
    
    public Consumo(){}
    
    //constructor parametrizado
    public Consumo(double km1, double lit1, double vMed1, double pGas1){
    this.km = km1;
    this.litros = lit1;
    this.pGas = pGas1;
    this.vMed = vMed1;
    
    
    }
    
    //métodos de acceso

    public double getKm() {
        return km/vMed;
    }

    public double getLitros() {
        return ((100 * litros)/km);
    }

    public double getvMed() {
        return vMed;
    }

    public double getpGas() {
        return pGas;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setvMed(double vMed) {
        this.vMed = vMed;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }
    
    //métodos
   
    public void consumoMedio(){
    double consumoMedio = litros/100;
     }
    
    public void consumoEuros(){
    double consumoEuros = (consumoMedio*euros);
    }
    
    
    






}


