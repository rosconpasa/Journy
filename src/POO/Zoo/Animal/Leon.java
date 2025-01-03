package POO.Zoo.Animal;

public class Leon extends Animal{

    public Leon(String nombre, int edad, String tipoAnimal, boolean esMacho, double peso, double altura, String color) {
        super(nombre, edad, tipoAnimal, esMacho, peso, altura, color);
    }

    @Override
    public String hacerSonido() {
        return getNombre()+": Rooooar!!!!";
    }

    @Override
    public boolean dormir() {
        return false;
    }
}
