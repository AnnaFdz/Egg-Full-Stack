/*
 Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package ejercicio_extra_extra_3_Entidad;

/**
 *
 * @author Anny
 */
public class Pass {
    java.util.Scanner leer = new java.util.Scanner(System.in);
    private String pass;
    private String nombre;
    private int DNI;

    public Pass(String pass, String nombre, int DNI) {
        this.pass = pass;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Pass() {
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }


    public void crearPass() {
        int lon = 0;
        do {
            System.out.println("Ingrese contraseña");
            pass = leer.next();
            pass = pass.toLowerCase();
            lon = pass.length();
            if (lon != 10) {
                System.out.println("La longitud de la contraseña es distinta de 10, ingrese nuevamente");
            }
        } while (lon != 10);
    }

    public void analizarPass() {
        int contA = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.substring(i, i+1).equals("a")) {
                contA++;
            }
        }
        if (pass.contains("z")) {
            if (contA >= 2) {
                System.out.println("La contraseña es de nivel ALTO");
            } else {
                System.out.println("La contraseña es de nivel MEDIO");
            }

        } else {
            System.out.println("La contraseña es de nivel BAJO");
        }
    }

    public void modificarDatos() {
        String pass1 = "";
        int op = 0;
        do {
            System.out.println("Ingrese su contraseña");
            pass1 = leer.next();
        } while (!pass.equals(pass1));

        do {
            System.out.println("Ingrese la opcion que desea modificar");
            System.out.println("1-DNI");
            System.out.println("2-Nombre");
            System.out.println("3-SALIR");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese su DNI");
                    DNI = leer.nextInt();

                    break;
                case 2:
                    System.out.println("Ingrese su nombre");
                    nombre = leer.next();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
            }
        } while (op != 3);
    }

    public void menu() {
        String pass1 = "";
        String op = "";
        boolean k = false;
        
        do{
        System.out.println("Ingrese la opcion");
        System.out.println("A) Ingresar la contraseña");
        System.out.println("B) Nivel de contraseña");
        System.out.println("C) Modificar contraseña");
        System.out.println("D) Modificar nombre y/o DNI ");
        System.out.println("E) SALIR");
        op = leer.next().toUpperCase();

        switch (op) {
            case "A":
                do {
                    System.out.println("Ingrese la contraseña");
                    pass1 = leer.next();
                } while (!pass1.equals(pass));
                k = true;
                break;
            case "B":
                if (k) {
                    analizarPass();
                } else {
                    System.out.println("Primero debe ingresar su contraseña (OPCION A)");
                }
                break;
            case "C":
                if (k) {
                    crearPass();
                } else {
                    System.out.println("Primero debe ingresar su contraseña (OPCION A)");
                }
                break;
            case "D":
                if (k) {
                    modificarDatos();
                } else {
                    System.out.println("Primero debe ingresar su contraseña (OPCION A)");
                }
                break;
            case "E":
                break;

            default:
                System.out.println("La opcion ingresada no es correcta");
        }
        } while (!op.equals("E"));

    }
     @Override
    public String toString() {
        return "Pass{" + "leer=" + leer + ", pass=" + pass + ", nombre=" + nombre + ", DNI=" + DNI + '}';
    }

}
