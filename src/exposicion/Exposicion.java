package exposicion;
import java.util.Scanner;
public class Exposicion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de salones: ");
        Salon[] salones = new Salon[Salon.validacion()];
        
        System.out.println("Ingrese el salon a editar: ");
        int salonActual = Salon.validacion(0,salones.length);
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        Alumno[] alumnos = new Alumno[Salon.validacion()];
        
    }
    
}
