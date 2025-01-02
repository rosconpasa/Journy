package POO.Zoo.Persona;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String documento;

    public Persona(){}

    public Persona(String documento, String nombre, int edad){
        this.documento=documento;
        this.nombre=nombre;
        this.edad=edad;
    }

    public abstract String toString();

    public abstract String saludar();


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
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
