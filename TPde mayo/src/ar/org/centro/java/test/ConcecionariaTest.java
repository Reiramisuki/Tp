package ar.org.centro.java.test;

import ar.org.centro.java.entidades.Auto;
import ar.org.centro.java.entidades.Moto;
import ar.org.centro.java.entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* @author Belen*/
public class ConcecionariaTest {
    public static void main(String[] args) {
    List<Vehiculo>lista= new ArrayList();
        lista.add(new Auto("Peugeot", "206","4",200000.00));
        lista.add(new Moto("Honda","Titan","125c",60000.00));
        lista.add(new Auto("Peugeot","208","5",250000.00));
        lista.add(new Moto("Yamaha","YBR","160c",80500.50));
        
     lista.forEach(System.out::println);
     System.out.println("\n==================================================\n");   
//============== Vehículo más Caro==============================================     
    Vehiculo vehiculoMasCaro=
            lista.stream().max(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
        System.out.println("Vehículo más caro: "+ vehiculoMasCaro.getMarca()+" "+vehiculoMasCaro.getModelo());
     
//============== Vehículo más Barato============================================   
    Vehiculo vehiculoMasBarato=
            lista.stream().min(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
        System.out.println("Vehículo más Barato: "+ vehiculoMasBarato.getMarca()+" "+vehiculoMasBarato.getModelo());
        
//==============Vehículo que contiene en el modelo la letra ‘Y’================= no coicide en el resultado de consola
         System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:");   
            lista.stream().filter(p->p.getModelo().toUpperCase().contains("Y")).forEach(p->System.out.println(p.getMarca()+" "+p.getModelo()+" $ "+p.getPrecio()));
         System.out.println("\n==============================================\n");           
//==============Vehiculos ordenados por precio de Mayor a Menor=================
        System.out.println("Vehículos ordenados por precio de Mayor a Menor:");
            lista.stream().sorted(Comparator.comparing(Vehiculo::getPrecio).reversed()).forEach(item->System.out.println(item.getMarca()+" "+item.getModelo()));
         System.out.println("\n==============================================\n");
//==============Vehículos ordenados por orden natural===========================
        System.out.println("Vehículos ordenados por orden natural:");
            lista.stream().sorted().forEach(System.out::println);
         System.out.println("\n==============================================\n");   
    }
}
