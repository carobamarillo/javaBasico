package com.ejercicio14;

public class Lavadora extends Electrodomestico{

    private final static int cargaPorDefecto=5;

    private int carga;
  

  

    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, consumoEnergeticoPorDefecto, colorPorDefecto, cargaPorDefecto);
    }
  

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
       
        this.carga=carga;
    }
    public int getCarga() {
        return carga;
    }
    public double precioFinal(){
        double plus=super.precioFinal();
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }
}