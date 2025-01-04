package POO.Zoo.Animal;

public class Leon extends Animal{

    public Leon(int id, String nombre, int edad, String tipoAnimal, boolean esMacho, double peso, double altura, String color) {
        super(id, nombre, edad, tipoAnimal, esMacho, peso, altura, color);
    }

    @Override
    public String hacerSonido() {
        return getNombre()+": Rooooar!!!!";
    }

    @Override
    public void dormir() {
        setEstaDormido(true);
    }

    @Override
    public String toString() {
        return "Se llama "+getNombre()+", tiene "+getEdad()+" años, "+isEsMacho()+", pesa "+getPeso()+" kilos";
    }
}
