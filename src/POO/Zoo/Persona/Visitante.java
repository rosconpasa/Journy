package POO.Zoo.Persona;

public class Visitante extends Persona {
    private boolean tieneTicket;

    public Visitante(String documento, String nombre, int edad, boolean tieneTicket){
        super(documento, nombre, edad);
        this.tieneTicket=tieneTicket;
    }

    @Override
    public String saludar(){
        return "Hola! Soy "+getNombre();
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
}
