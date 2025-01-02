package POO.Zoo.Animal;

public class Arana extends Animal{

    private String especie;
    private boolean venenosa;
    private int numeroPatas;



    public Arana(String nombre, int edad, String tipoAnimal,  boolean esMacho, String color,
                 String especie, boolean venenosa, int numeroPatas){

        super(nombre, edad, tipoAnimal, esMacho, color);
        this.especie=especie;
        this.venenosa=venenosa;
        this.numeroPatas=numeroPatas;
    }




    @Override
    public String hacerSonido() {
        return "Sonido de araña";
    }



    @Override
    public boolean dormir() {
        return false;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
