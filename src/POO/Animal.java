package POO;

public class Animal {


    private int edad;
    private String nombre;
    private boolean tieneDueno;



    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.tieneDueno = false;
    }


    public Animal(String nombre, int edad, boolean tieneDueno) {
        this.nombre = nombre;
        if (edad<0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.tieneDueno = tieneDueno;
    }

    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.tieneDueno=false;
    }

    public Animal(String nombre){
        this.nombre=nombre;
        this.edad=0;
        this.tieneDueno=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        } else {
            this.edad = edad;
        }
    }

    public boolean istieneDueno() {
        return tieneDueno;
    }

    public void setTieneDueno(boolean tieneDueno) {
        this.tieneDueno = tieneDueno;
    }

    public String toString() {
        return "Nombre: " + nombre + ". Edad: " + edad + ". Tiene dueño: " + tieneDueno;
    }

}
