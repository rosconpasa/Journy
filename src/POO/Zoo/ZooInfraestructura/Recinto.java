package POO.Zoo.ZooInfraestructura;

import POO.Zoo.Animal.Animal;

import java.util.ArrayList;

public class Recinto <T extends Animal> {
    private String nombre;
    private int capacidad;
    private ArrayList <T> animales;

    public Recinto(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(T animal){
        if (animales.isEmpty()){
            animales.add(animal);
            System.out.println("Animal agregado al recinto "+getNombre()+" exitosamente");
        }else if (animales.get(0).getClass().equals(animal.getClass())){
            for (T animall : animales){
                if (animal.getId()==animall.getId()){
                    System.out.println(animal.getNombre()+ " con id="+animal.getId()+" ya se encuentra en el recinto");
                }else{
                    animales.add(animal);
                    System.out.println("Animal "+animal.getNombre()+" agregado al recinto "+getNombre()+" exitosamente");
                }
            }
        }else{
            System.out.println("No se puede agregar un animal que no sea "+animales.get(0).getClass().getSimpleName());
        }
    }



    public void mostrarRecinto(){
        int i=1;
        System.out.print("Recinto "+getNombre()+" ");
        for (T animal : animales){
            System.out.println(i+": "+animal);
            i++;
        }
    }


    @Override
    public String toString(){
        return "Nombre de recinto: "+getNombre()+ ".Capacidad del recinto: "+getCapacidad();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<T> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<T> animales) {
        this.animales = animales;
    }
}
