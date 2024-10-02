package tp_3.ejercicio_4;

import java.util.BitSet;

/**
 *
 * @author santino.fuentes
 */
public class Area
{
        private boolean espacios[];
        //private BitSet espacioBitSet; // :$
        private String nombre;
        
        public Area(String unNombre, int cantidadEspacios)
        {
                this.nombre = unNombre;
                this.espacios = new boolean[cantidadEspacios];
                
                for (int i = 0; i < espacios.length; i++) {
                        espacios[i] = false;
                }
        }
        
        /**
         * Si hay algún espacio disponible, retorna el índice de ese espacio,
         * sino, retorna -1
         *
         * @return El índice del espacio
         */
        private int hayDisponibilidad()
        {
                int i = 0;
                int espacioDisponible = -1;
                
                while (espacioDisponible == -1 && i < espacios.length) {
                        if (!espacios[i])
                                espacioDisponible = i;
                        i++;
                }
                
                return espacioDisponible;
        }
        
        /**
         * Asigna un espacio en el área al visitante
         * 
         * @param unEspacio
         */
        private void asignarEspacio(int unEspacio)
        {
                this.espacios[unEspacio] = true;
        }
        
        public synchronized void liberarEspacio()
        {
                this.espacios[0] = false;
        }
        
        /**
         * Reserva un espacio en algún área para el visitante
         *
         * @return Un ticket
         * @throws java.lang.InterruptedException
         */
        public synchronized String reservar() throws InterruptedException
        {
                int espacioDisponible = hayDisponibilidad();
                
                if (espacioDisponible != -1)
                        asignarEspacio(espacioDisponible);
                
                return (Thread.currentThread().getName()
                        + "\n|--> COMPRA REALIZADA"
                        + "\n|--> TICKET INGRESO AREA: " + this.nombre);
        }
}
