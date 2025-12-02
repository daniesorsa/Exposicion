package exposicion;
public class Alumno {
    //atributos
    String nombre;
    int edad;
    double promedio;
    
    //constructor

    public Alumno(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }
    
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n   Edad: " + edad + "\n   Promedio: " + promedio;
    }
    
}
