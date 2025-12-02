package exposicion;
import java.util.Scanner;
public class Exposicion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                    
        int cantidadSalones = 0;
        Salon[] salones = null;
        int index = 0;
        int selMenu = 0;
        do {
            System.out.println("---Sistema de informacion del instituto---");
            System.out.println("1) Modificar informacion");
            System.out.println("2)Mostrar informacion");
            System.out.println("0) Salir");
            selMenu = Salon.validacion();
            switch(selMenu) {
                case 1:
                    if(salones == null) {
                        System.out.print("Ingrese la cantidad de salones: ");
                        cantidadSalones = Salon.validacion();
                        salones = new Salon[cantidadSalones];
                    }
                    boolean salonVacio = false;
                    System.out.println("----------------------------------");
                    for(int i = 0; i < salones.length; i++) {
                        if(salones[i] == null) {
                            System.out.println("Salon " + i + ": Sin informacion");
                            salonVacio = true;
                        }
                        else {
                            System.out.println("Salon " + i + ": Con la siguiente informacion:");
                            System.out.println(salones[i]);
                        }
                    }
                   if(!salonVacio) {
                        System.out.print("Todos los salones tienen informacion, Desea cambiar alguno?");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        int selCambioInfo = Salon.validacion(1,2);
                        if(selCambioInfo == 2) {
                            System.out.println("Gracias por utilizar el sistema");
                            continue;
                        }
                    }

                    System.out.print("Ingrese el salon a editar(0-"+ (salones.length - 1) +" : ");
                    int salonActual = Salon.validacion(0,salones.length - 1);

                    System.out.print("Ingrese el numero de la seccion: ");
                    int seccion = Salon.validacion();

                    System.out.print("Ingrese el nombre del maestro: ");
                    String maestro = sc.next();

                    System.out.print("Ingrese la cantidad de estudiantes: ");
                    int cantidadAlumnos = Salon.validacion();
                    Alumno[] alumnos = new Alumno[Salon.validacion()];

                    for(int i = 0; i < cantidadAlumnos; i++) {
                        System.out.println("\nIngrese la informacion del estudiante en posicion #" + i);
                        System.out.print("Nombre: ");
                        String nombre = sc.next();
                        System.out.print("Edad: ");
                        int edad = Salon.validacion();
                        System.out.print("Promedio: ");
                        double promedio = sc.nextDouble();
                        alumnos[i] = new Alumno(nombre,edad,promedio);
                    }

                    salones[salonActual] = new Salon(seccion,cantidadAlumnos,maestro,alumnos);
                    break;
                case 2:
                    if(salones == null) {
                        System.out.println("No hay informacion para mostrar aun, seleccione la opcion de modificar");
                        break;
                    }
                    System.out.println("-----Informacion de los salones-----\n\n");
                    for(int i = 0; i < cantidadSalones; i++) {
                        if(salones[i] == null) {
                            System.out.println("---------------------------------");
                            System.out.println("Informacion incompleta del salon #" + i);
                            System.out.println("---------------------------------");
                            continue;
                        }
                        System.out.println("------------------------------------");
                        System.out.println("Salon #" + salones[i] );
                        System.out.println(salones[i]);
                        System.out.println("------------------------------------");
                    }
                    break;
            }
        } while(selMenu != 0); 
    }
}
