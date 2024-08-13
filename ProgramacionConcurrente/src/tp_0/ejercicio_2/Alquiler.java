package tp_0.ejercicio_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Implementación del TDA Alquiler.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Alquiler
{
        private short posicionEstacionamiento;
        private Cliente cliente;
        private Avion avion;
        private LocalDate fechaInicio;
        private LocalDate fechaFin;
        private LocalTime horaInicio;
        private LocalTime horaFin;
        
        static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        
        public Alquiler(short unaPosicionEstacionamiento,
                Cliente unCliente,
                Avion unAvion,
                String unaFechaInicio,
                String unaFechaFin,
                String unaHoraInicio,
                String unaHoraFin)
        {
                this.posicionEstacionamiento = unaPosicionEstacionamiento;
                this.cliente = unCliente;
                this.avion = unAvion;
                try {
                        this.fechaInicio = LocalDate.parse(unaFechaInicio, dateFormatter);
                        this.fechaFin = LocalDate.parse(unaFechaFin, dateFormatter);
                        this.horaInicio = LocalTime.parse(unaHoraInicio, timeFormatter);
                        this.horaFin = LocalTime.parse(unaHoraFin, timeFormatter);
                } catch (DateTimeParseException excepcion) {
                        System.out.println("Formato de fecha u hora inválido");
                        System.out.println(excepcion.getMessage());
                }
        }
}
/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        // Definir el formato
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parsear una fecha desde una cadena
        String fechaCadena = "12/08/2024";
        try {
            LocalDate fecha = LocalDate.parse(fechaCadena, dateFormatter);
            System.out.println("Fecha: " + fecha);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido");
        }
    }
}

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        // Definir el formato
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        // Parsear una hora desde una cadena
        String horaCadena = "14:30";
        try {
            LocalTime hora = LocalTime.parse(horaCadena, timeFormatter);
            System.out.println("Hora: " + hora);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de hora inválido");
        }
    }
}

*/