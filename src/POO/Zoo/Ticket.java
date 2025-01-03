package POO.Zoo;

public class Ticket {
    private int precio;
    private int cantidad;

    public Ticket(){}

    public Ticket(int precio, int cantidad) {
        this.precio = precio;
        this.cantidad=cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
