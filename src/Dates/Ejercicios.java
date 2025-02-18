package Dates;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {
    Scanner sc = new Scanner(System.in);


    public void crearFecha() {
        try {
            System.out.println("Ingrese el año:");
            int anio = sc.nextInt();
            System.out.println("Ingrese el mes:");
            int mes = sc.nextInt();
            System.out.println("Ingrese el día:");
            int dia = sc.nextInt();


            LocalDate fecha = LocalDate.of(anio, mes, dia);
            System.out.println("Fecha creada correctamente: " + fecha);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar valores válidos (enteros). " + e.getMessage());
        } catch (DateTimeException e) {
            System.out.println("Error: Fecha inválida. " + e.getMessage());
        }

    }

    public void crearHora(){
        try {
            System.out.println("Ingrese la hora:");
            int hora=sc.nextInt();
            System.out.println("Ingrese los minutos:");
            int min = sc.nextInt();
            System.out.println("Ingrese los segundos:");
            int seg = sc.nextInt();
            System.out.println("Hora creada exitósamente: "+ LocalTime.of(hora, min, seg));
        }catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar valores válidos.");
        }catch (DateTimeException e){
            System.out.println("Error: Hora no válida.");
        }
    }
}
