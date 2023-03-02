/*
 siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package herencia_ejercicio_2;

import herencia_ejercicio_2_Entidades.Electrodomestico;
import herencia_ejercicio_2_Entidades.Lavadora;
import herencia_ejercicio_2_Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Anny
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Electrodomestico elec = new Electrodomestico();
       ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        Televisor tv1 = new Televisor(19, true, 20000d, "rojo", 'D', 10d);
        electrodomesticos.add(tv1);
        Lavadora lava1 = new Lavadora(50, 15000d, "azul", 'F', 5d);
        electrodomesticos.add(lava1);
      
          Televisor tv2 = new Televisor(60, false, 70000d, "blanco", 'A', 40d);
          electrodomesticos.add(tv2);
        Lavadora lava2 = new Lavadora(90, 30000d, "negro", 'B', 20d);
        electrodomesticos.add(lava2);
        int suma=0;
        for (Electrodomestico aux : electrodomesticos) {
            if(aux == tv1){
                tv1.precioFinal();
                suma+=tv1.getPrecio();
                System.out.println("el precio final del TV: "+tv1.getPrecio());
            } else if(aux == lava1){
                lava1.precioFinal();
                suma+=lava1.getPrecio();
                System.out.println("el precio final de la lavadora: "+lava1.getPrecio());
            }else  if(aux == tv2){
                tv2.precioFinal();
                suma+=tv2.getPrecio();
                System.out.println("el precio final del TV: "+tv2.getPrecio());
            } else if(aux == lava2){
                lava1.precioFinal();
                suma+=lava2.getPrecio();
                System.out.println("el precio final de la lavadora: "+lava2.getPrecio());
        }
            
    }
    System.out.println("El precio total de todos los electrodomesticos es: " +suma);
}
}
