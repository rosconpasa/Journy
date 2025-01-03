package POO.Zoo.Persona;

import POO.Zoo.Animal.Animal;
import POO.Zoo.Zoologico;

public class Empleado extends Persona {

    private String cargo;
    private String tipoContrato;

    public Empleado(){}

    public Empleado(String documento, String nombre, int edad, String cargo, String tipoContrato){
        super(documento, nombre, edad);
        this.cargo=cargo;
        this.tipoContrato=tipoContrato;
    }

    public boolean abrirZoo(Zoologico zoo){
        if (getCargo().equals("Portero") && !zoo.isAbierto()){
            System.out.println("Bienvenidos a "+zoo.getNombre()+"!!");
            zoo.setAbierto(true);
        } else  {
            System.out.println("No está autorizado para abrir");
        }
        return zoo.isAbierto();
    }

    public String alimentar(Animal animal){
        if (!getCargo().equals("Cuidador")){
            return "Usted no puede alimentar a los animales";
        }else if(animal.isHaComido()){
            return animal.getNombre()+" ya hacomido!!";
        }else{
            animal.setHaComido(true);
            return animal.getNombre()+": yummm";
        }
    }

    public void explica(Animal animal){
        if (getCargo().equals("Cuidador")){
            System.out.println(getNombre()+": "+saludar());
            System.out.println(getNombre()+": "+"Este amiguito es "+animal.getNombre()+animal);
            System.out.println(animal.hacerSonido());
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
