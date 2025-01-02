package POO.Zoo.Persona;

import POO.Zoo.Animal.Animal;

public class Empleado extends Persona {

    private String cargo;
    private String tipoContrato;

    public Empleado(){}

    public Empleado(String documento, String nombre, int edad, String cargo, String tipoContrato){
        super(documento, nombre, edad);
        this.cargo=cargo;
        this.tipoContrato=tipoContrato;
    }

    public String alimentar(Animal animal){
        if (!getCargo().equals("Cuidador")){
            return "Usted no puede alimentar a los animales";
        }else{
            return "yummm";
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
