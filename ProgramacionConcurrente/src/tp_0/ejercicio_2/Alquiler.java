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
        private int posicionEstacionamiento;
        private Cliente cliente;
        private Avion avion;
        private LocalDateTime fechaHoraInicio;
        private LocalDateTime fechaHoraFin;
        
        static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        
        /**
         * Constructor con todos los parámetros.
         * 
         * @param unaPosicionEstacionamiento
         * @param unCliente
         * @param unAvion
         * @param unaFechaInicio
         * @param unaHoraInicio
         * @param unaFechaFin
         * @param unaHoraFin 
         */
        public Alquiler(int unaPosicionEstacionamiento,
                Cliente unCliente,
                Avion unAvion,
                String unaFechaInicio,
                String unaHoraInicio,
                String unaFechaFin,                
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
        
        /**
         * Calcula la cantidad de horas entre el inicio y el fin del alquiler.
         * 
         * @return La cantidad de horas.
         */
        private long obtenerDuracionEnHoras()
        {
                return (Duration.between(fechaHoraInicio, fechaHoraFin).toHours());
        }
        
        /**
         * Calcula el valor del alquiler según duración, envergadura del avión
         * y el módulo variable.
         * 
         * @return El valor del alquiler.
         */
        public double obtenerValor()
        {
                return (this.obtenerDuracionEnHoras() * (this.avion.obtenerEnvergadura() * 20) + 250);
        }
}