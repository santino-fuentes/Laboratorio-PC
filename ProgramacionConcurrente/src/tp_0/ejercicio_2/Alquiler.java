package tp_0.ejercicio_2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
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
        private LocalDateTime fechaHoraInicio;
        private LocalDateTime fechaHoraFin;
        
        static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        
        /**
         * 
         * @param unaPosicionEstacionamiento
         * @param unCliente
         * @param unAvion
         * @param unaFechaInicio
         * @param unaFechaFin
         * @param unaHoraInicio
         * @param unaHoraFin 
         */
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
                        this.fechaHoraInicio = LocalDateTime.of(
                                LocalDate.parse(unaFechaInicio, dateFormatter), 
                                LocalTime.parse(unaHoraInicio, timeFormatter));
                        this.fechaHoraFin = LocalDateTime.of(
                                LocalDate.parse(unaFechaFin, dateFormatter), 
                                LocalTime.parse(unaHoraFin, timeFormatter));
                } catch (DateTimeParseException excepcion) {
                        System.out.println("Formato de fecha u hora inválido");
                        System.out.println(excepcion.getMessage());
                }
        }
        
        private long obtenerDuracionEnHoras()
        {
                return (Duration.between(fechaHoraInicio, fechaHoraFin).toHours());
        }
        
        public double obtenerValor()
        {
                return (this.obtenerDuracionEnHoras() * (this.avion.obtenerEnvergadura() * 20) + 250);
        }
}