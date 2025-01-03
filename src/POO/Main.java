package POO;


import POO.Zoo.Animal.Animal;
import POO.Zoo.Persona.Empleado;
import POO.Zoo.Animal.Leon;
import POO.Zoo.Zoologico;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("1111", "Juan", 38, "Cuidador",
                "Asalariado");

        Empleado empleado2 = new Empleado("1222", "Pedro", 28, "Portero",
                "Asalariado");

        Leon leon = new Leon("Simba", 5, "Mamifero", true,
                181, 1.2, "Salmón");

        Zoologico zoo = new Zoologico("Vida Animal");

        empleado2.abrirZoo(zoo);

        empleado.explica(leon);
        System.out.println("Vamos a alimentarlo");
        System.out.println(empleado.alimentar(leon));





    }
}
