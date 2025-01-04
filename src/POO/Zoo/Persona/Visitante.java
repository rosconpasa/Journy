package POO.Zoo.Persona;

import POO.Zoo.ZooInfraestructura.*;

import java.util.Scanner;

public class Visitante extends Persona {


    Scanner sc =new Scanner(System.in);

    private boolean tieneTicket;
    private int dinero;


    public Visitante(String documento, String nombre, int edad, boolean tieneTicket){
        super(documento, nombre, edad);
        this.tieneTicket=false;
    }

    @Override
    public String saludar(){
        return "Hola! Soy "+getNombre();
    }

    public boolean comprarTicket(int total){
        setDinero(getDinero()-total);
        setTieneTicket(true);
        return isTieneTicket();
    }

    public boolean entrar(Zoologico zoo){
        if (isTieneTicket() && zoo.isAbierto() ){
            System.out.println(getNombre()+": Buenas!!");
        }else if (isTieneTicket() && !zoo.isAbierto()){
            System.out.println("Lo siento. Estamos cerrados");
        } else if (!isTieneTicket()) {
            System.out.println("Necesita un ticket para entrar");
        }
        return isTieneTicket();
    }

    @Override
    public String toString(){
        return "Documento: "+getDocumento()+". Nombre: "+getNombre()+". Edad: "+getEdad()+". Tiene ticket: "+isTieneTicket();
    }

    public boolean isTieneTicket() {
        return tieneTicket;
    }

    public void setTieneTicket(boolean tieneTicket) {
        this.tieneTicket = tieneTicket;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
