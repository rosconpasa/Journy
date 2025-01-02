package POO;


import POO.Zoo.Animal.Animal;
import POO.Zoo.Persona.Empleado;
import POO.Zoo.Animal.Leon;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("1234", "Juan", 38, "Cuidador",
                "Asalariado");

        Leon leon = new Leon("Simba", 5, "Mamifero", true,
                181, 1.2, "Salmón");

        System.out.println(empleado.alimentar(leon));




    }
}
