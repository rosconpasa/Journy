package POO.Zoo.Animal;

public abstract class Animal {
    private String nombre;
    private int edad;
    private boolean esMacho; //false = hembra
    private String tipoAnimal;
    private double peso;
    private double altura;
    private String color;
    private boolean haComido;
    private boolean estaDormido;


    public Animal() {
    }

    public Animal(String nombre, int edad, String tipoAnimal, boolean esMacho, double peso, double altura, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal=tipoAnimal;
        this.esMacho=esMacho;
        this.peso=peso;
        this.altura=altura;
        this.color=color;
    }

    public Animal(String nombre, int edad, String tipoAnimal, boolean esMacho, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal=tipoAnimal;
        this.esMacho=esMacho;
        this.color=color;
    }


    public abstract String hacerSonido();
    public abstract boolean dormir();


    public String toString(){
        return ". Tiene "+getEdad()+" años"+". Es un "+getTipoAnimal()+" "+isEsMacho()+" de color "+getColor();
    }

    public boolean isHaComido() {
        return haComido;
    }

    public void setHaComido(boolean haComido) {
        this.haComido = haComido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String isEsMacho() {
        return esMacho ? ".Es macho" : ".Es hembra";
    }

    public void setEsMacho(boolean esMacho) {
        this.esMacho = esMacho;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstaDormido() {
        return estaDormido;
    }

    public void setEstaDormido(boolean estaDormido) {
        this.estaDormido = estaDormido;
    }
}

