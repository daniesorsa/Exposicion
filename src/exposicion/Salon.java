package exposicion;
import java.util.Scanner;
public class Salon {
    
    // atributos
    String seccion;
    int cantidadAlumnos;
    String maestro;
    Alumno[] alumnos = new Alumno[cantidadAlumnos];

    public Salon(String seccion, int cantidadAlumnos, String maestro) {
        this.seccion = seccion;
        this.cantidadAlumnos = cantidadAlumnos;
        this.maestro = maestro;
    }
    
    
    
    public static int validacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor(mayor a 0): ");
        int x = sc.nextInt();
        while(x <= 0) {
            System.out.print("Opcion no valida intente de nuevo: ");
            x = sc.nextInt();
        }
        return x;
    }
    public static int validacion(int x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una opcion entre " + x + " y " + y + ": ");
        int z = sc.nextInt();
        while(z < x || z > y) {
            System.out.print("Opcion no valida intente de nuevo: ");
            z = sc.nextInt();
        }
        return z;
    }
}
