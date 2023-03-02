/*
 Crea una clase en Java donde declares una variable de tipo array de Strings que contenga 
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto 
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El 
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar 
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un 
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado
 */
package poo_ejercicioextra_5_Entidades;

/**
 *
 * @author Anny
 */
public class Mes {

    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto= mes[(int)(Math.random()*12)];

    public Mes() {
    }

 

    public String[] getMeses() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

   

    public void setMeses(String[] meses) {
        this.mes = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void adivinarMes() {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        String adivinar;
        do {
            System.out.println("ingrese un mes: ");
            adivinar = leer.next();
            if (adivinar.equals(mesSecreto)) {
                System.out.println("CORRECTO!!");
            } else {
                System.out.println("INCORRECTO,intente de nuevo...");
            }
        } while (!adivinar.equalsIgnoreCase(mesSecreto));

    }
    public void mostrar(){
        System.out.println(mesSecreto);
    }
}
