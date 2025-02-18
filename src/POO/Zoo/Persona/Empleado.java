package POO.Zoo.Persona;

import POO.Zoo.Animal.Animal;
import POO.Zoo.ZooInfraestructura.Zoologico;
import POO.Zoo.ZooInfraestructura.Ticket;

import java.util.Scanner;

public class Empleado extends Persona {

    Scanner sc = new Scanner(System.in);
    private String cargo;
    private String tipoContrato;

    public Empleado() {
    }

    public Empleado(String documento, String nombre, int edad, String cargo, String tipoContrato) {
        super(documento, nombre, edad);
        this.cargo = cargo;
        this.tipoContrato = tipoContrato;
    }

    public boolean abrirZoo(Zoologico zoo) {
        if (getCargo().equals("Portero") && !zoo.isAbierto()) {
            System.out.println("Bienvenidos a " + zoo.getNombre() + "!!");
            zoo.setAbierto(true);
        } else {
            System.out.println("No está autorizado para abrir");
        }
        return zoo.isAbierto();
    }

    public String alimentar(Animal animal) {
        if (animal.isEstaDormido()) {
            return animal.getNombre() + " se encuentra durmiendo";
        } else {
            if (!getCargo().equals("Cuidador")) {
                return "Usted no puede alimentar a los animales";
            } else if (animal.isHaComido()) {
                return animal.getNombre() + " ya hacomido!!";
            } else {
                animal.setHaComido(true);
            }
            return animal.getNombre() + ": yummm";
        }
    }

    public void explica(Animal animal) {
        if (getCargo().equals("Cuidador")) {
            System.out.println(getNombre() + ": " + saludar());
            System.out.println(getNombre() + ": " + "Este amiguito es " + animal.getNombre() + animal);
        }
    }

    public void venderTicket(Visitante visitante, Ticket ticket, int cantidad) {
        if (!getCargo().equals("Ticketero")) {
            System.out.println("No es´ta autorizado para vender");
        } else if (ticket.getCantidad() < 0) {
            System.out.println("No contamos con tickets en este momento");
        } else if (cantidad>ticket.getCantidad()) {
            System.out.println("No contamos con los tickets suficientes");
        }else{
            int total = cantidad * ticket.getPrecio();
            if (visitante.getDinero() < total) {
                System.out.println("Lo siento. No tiene suficiente dinero");
            } else {
                System.out.println("El total es de "+total+" pesos.");
                ticket.setCantidad(ticket.getCantidad()-cantidad);
                visitante.comprarTicket(total);
                System.out.println("Venta exitosa");
            }
        }
    }




    @Override
    public String saludar(){
        return "Hola! Soy "+getNombre()+" y mi puesto es "+getCargo()+". Háblame si necesitas algo";
    }

    @Override
    public String toString(){
        return "Documento: "+getDocumento()+", Nombre: "+getNombre()+". Edad: "+getEdad() +
                ". Cargo: "+getCargo()+". Tipo contrato: "+getTipoContrato();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
