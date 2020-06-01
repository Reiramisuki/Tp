package ar.org.centro.java.entidades;

import java.text.DecimalFormat;
/* @author Belen*/
public class Moto extends Vehiculo {
    DecimalFormat formateo = new DecimalFormat("##,###.00");
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio ) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: "+ super.getMarca()+" //Modelo: "+super.getModelo()+" // Cilindrada: "+cilindrada+" //Precio:$"+formateo.format(super.getPrecio());
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.compare().compareTo(v.compare());
    }
     
}
