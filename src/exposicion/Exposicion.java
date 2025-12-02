package exposicion;
import java.util.Scanner;
public class Exposicion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---Sistema de informacion del instituto---");
        System.out.print("Ingrese la cantidad de salones: ");
        Salon[] salones = new Salon[Salon.validacion()];
        boolean salonVacio = false;
        int index = 0;
        while(true)
        {
            for(int i = 0; i < salones.length; i++) {
                if(salones[i] == null) {
                    salonVacio = true;
                }
            }
            if(!salonVacio) {
                System.out.print("Todos los salones tienen informacion, Desea cambiar alguno?");
                System.out.println("1) Si");
                System.out.println("2) No");
                int selCambioInfo = Salon.validacion(1,2);
                if(selCambioInfo == 2) {
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                }
            }
            
            System.out.print("Ingrese el salon a editar: ");
            int salonActual = Salon.validacion(0,salones.length - 1);
            
            
            System.out.print("Ingrese el numero de la seccion: ");
            int seccion = sc.nextInt();
            
            System.out.print("Ingrese el nombre del maestro: ");
            String maestro = sc.next();
            
            System.out.print("Ingrese la cantidad de estudiantes: ");
            int cantidadAlumnos = sc.nextInt();
            Alumno[] alumnos = new Alumno[Salon.validacion()];
            
            for(int i = 0; i < cantidadAlumnos; i++) {
                System.out.println("Ingrese la informacion del estudiante #" + i);
                System.out.print("Nombre: ");
                String nombre = sc.next();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                System.out.print("Promedio: ");
                double promedio = sc.nextDouble();
                alumnos[i] = Alumno(nombre,edad,promedio);
            }
            
            salones[index] = Salon(seccion,cantidadAlumnos,maestro,alumnos);
            index++;
        }
    }
    
}
