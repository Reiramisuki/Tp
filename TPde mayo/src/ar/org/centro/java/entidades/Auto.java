package ar.org.centro.java.entidades;

import java.text.DecimalFormat;

/* @author Belen*/
public class Auto extends Vehiculo {
    DecimalFormat formateo = new DecimalFormat("##,###.00");
    private String puertas;

    public Auto(String marca, String modelo, String puertas,double precio) {
        super(marca, modelo, precio);
        this.puertas=puertas;
    }
    
    @Override
    public String toString() {
        return "Marca: "+ super.getMarca()+" //Modelo: "+super.getModelo()+" //Puertas: "+puertas+" //Precio:$"+formateo.format(super.getPrecio());
    }
    
    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.compare().compareTo(v.compare());
    }
}
