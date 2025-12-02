package exposicion;
import java.util.Scanner;
public class Salon {
    
    // atributos
    int seccion;
    String maestro;
    int cantidadAlumnos;
    Alumno[] alumnos = new Alumno[cantidadAlumnos];

    // constructor
    public Salon(int seccion, int cantidadAlumnos, String maestro, Alumno[] alumnos) {
        this.seccion = seccion;
        this.cantidadAlumnos = cantidadAlumnos;
        this.maestro = maestro;
        this.alumnos = alumnos;
    }
    
    // getters
    public int getSeccion() {
        return seccion;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public String getMaestro() {
        return maestro;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    //setters
    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    
    // metodos
    @Override
    public String toString() {
        return "Salon{" + "Seccion: " + seccion + "\n     CantidadAlumnos: " + cantidadAlumnos + "\n     Maestro: " + maestro + "\n     Alumnos: " + alumnos + '}';
    }

    
    
    // metodos estaticos
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
