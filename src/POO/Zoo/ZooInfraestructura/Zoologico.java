package POO.Zoo.ZooInfraestructura;


public class Zoologico {

    private String nombre;
    private boolean abierto;



    public Zoologico(String nombre){
        this.nombre=nombre;
        this.abierto=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
}
