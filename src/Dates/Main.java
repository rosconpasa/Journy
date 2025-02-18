package Dates;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {


        System.out.println("La fecha de hoy es: "+LocalDate.now());

        LocalTime horaActual = LocalTime.now();
        System.out.println("La hora actual es: "+horaActual);
        System.out.println("La fecha y hora actual es: "+LocalDateTime.now());

        System.out.println("__________________________");
        LocalDate fecha =  LocalDate.of(2023,12,1);
        System.out.println("Fecha personalizada: "+fecha);

        LocalTime hora = LocalTime.of(16, 30);
        System.out.println("Hora personalizada: "+hora.format(DateTimeFormatter.ofPattern("hh:mm: a")));


        Ejercicios ejercicios = new Ejercicios();
        ejercicios.crearFecha();
        ejercicios.crearHora();




    }
}
