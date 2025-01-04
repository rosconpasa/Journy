package POO;



import POO.Zoo.Animal.Animal;
import POO.Zoo.Animal.Arana;
import POO.Zoo.Persona.*;
import POO.Zoo.Animal.Leon;
import POO.Zoo.ZooInfraestructura.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("1111", "Juan", 38, "Cuidador",
                "Asalariado");

        Empleado empleado2 = new Empleado("1222", "Pedro", 28, "Portero",
                "Asalariado");

        Empleado empleado3 = new Empleado("1333","Laura", 25, "Ticketero",
                "Asalariado");

        Leon leon = new Leon(1,"Simba", 5, "Mamifero", true,
                181, 1.2, "Salmón");

        Arana arana = new Arana(2, "Arañita", 2, "Araña", true, "Rojo", "arañaa",
                true,  8);

        Zoologico zoo = new Zoologico("Vida Animal");

        Ticket ticket = new Ticket(10000, 5);

        Visitante visitante = new Visitante("9111", "Pablo" ,24, false);
        visitante.setDinero(200000);
       /*
        empleado2.abrirZoo(zoo);

        empleado3.venderTicket(visitante, ticket, 4);
        visitante.entrar(zoo);


       empleado.explica(leon);
        leon.setEstaDormido(true);
        System.out.println("Vamos a alimentarlo");
        System.out.println(empleado.alimentar(leon));
*/

        Recinto recinto = new Recinto("Leones", 2);
        Recinto recinto2 = new Recinto("Arañas", 2);

        recinto.agregarAnimal(leon);
        recinto2.agregarAnimal(arana);
        recinto2.agregarAnimal(arana);
        recinto2.agregarAnimal(leon);

        recinto.mostrarRecinto();
        recinto2.mostrarRecinto();






    }
}
