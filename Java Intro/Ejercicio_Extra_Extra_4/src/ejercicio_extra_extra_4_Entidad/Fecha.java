/*
 *Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
Profe. Adri Bestilleiro
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto
 */
package ejercicio_extra_extra_4_Entidad;

/**
 *
 * @author Anny
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int verifAnio() {
        if (anio < 1900 || anio > 2021) {
            return anio = 1900;
        } else {
            return anio;

        }
    }

    public void diasTotalesdelMes() {
        if (mes == 2) {
            if ((anio % 4 == 0) && !(anio % 100 == 0)) {
                System.out.println("Las cantidad de dias totales es : 29");

            } else {
                if ((anio % 100 == 0) && (anio % 400 == 0)) {
                    System.out.println("Las cantidad de dias totales es : 29");

                } else {
                    System.out.println("Las cantidad de dias totales es : 28");

                }
            }
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("Las cantidad de dias totales es :  31");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("Las cantidad de dias totales es :  30");
        }

    }

    public void diaAnterior() {
        int mes2 = mes;
        if (mes > 1) {
            mes = mes - 1;
            if (mes == 2) {

                if ((anio % 4 == 0) && !(anio % 100 == 0)) {
                    System.out.println("La fecha anterior a la ingresada es " + 29 + " del " + 2 + " de " + anio);

                } else if ((anio % 100 == 0) && (anio % 400 == 0)) {
                        System.out.println("La fecha anterior a la ingresada es " + 29 + " del " + 2 + " de " + anio);
                    } else {
                        System.out.println("La fecha anterior a la ingresada es " + 28 + " del " + 2 + " de " + anio);
                    }
                
            }else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        System.out.println("La fecha anterior a la ingresada es " + 31 + " del " + mes + " de " + anio);
                    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        System.out.println("La fecha anterior a la ingresada es " + 30 + " del " + mes + " de " + anio);
                    } else {
                        System.out.println("La fecha anterior a la ingresada es " + (dia - 1) + " del " + mes + " de " + anio);
                    }
        }
    
        mes=mes+1;
    }

    public void diaPosterior() {

        if (dia == 28 && mes == 2) {
            if ((anio % 4 == 0) && !(anio % 100 == 0)) {
                System.out.println("La fecha posterior a la ingresada es " + (dia + 1) + " del " + mes + " de " + anio);

            } else {
                if ((anio % 100 == 0) && (anio % 400 == 0)) {
                    System.out.println("La fecha posterior a la ingresada es " + (dia + 1) + " del " + mes + " de " + anio);

                } else {
                    System.out.println("La fecha posterior a la ingresada es " + 1 + " del " + (mes + 1) + " de " + anio);

                }
            }
        } else if (dia == 31 && mes == 12) {
            System.out.println("La fecha posterior a la ingresada es " + 1 + " del " + 1 + " de " + anio + 1);

        } else if ((dia == 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
            System.out.println("La fecha posterior a la ingresada es " + 1 + " del " + (mes + 1) + " de " + anio);

        } else if ((dia == 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("La fecha posterior a la ingresada es " + 1 + " del " + (mes + 1) + " de " + anio);

        } else {
            System.out.println("La fecha posterior a la ingresada es " + (dia + 1) + " del " + mes + " de " + anio);

        }
    }

    public boolean anioBisiesto() {

        boolean bisiesto = false;
        if ((anio % 4 == 0) && !(anio % 100 == 0)) {
            bisiesto = true;
        } else if ((anio % 100 == 0) && (anio % 400 == 0)) {
            bisiesto = true;
        }

        return bisiesto;

    }

    @Override
        public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

}
