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
        
        private int hayDisponibilidad()
        {
                int i = 0;
                int espacioDisponible = -1;
                
                while (espacioDisponible == -1 && i < espacios.length) {
                        if (!espacios[i])
                                espacioDisponible = i;
                }
                
                return espacioDisponible;
        }
        
        private void asignarEspacio(int unEspacio)
        {
                this.espacios[unEspacio] = true;
        }
        
        public synchronized String reservar(Visitante unVisitante)
        {
                int espacioDisponible = hayDisponibilidad();
                
                if (espacioDisponible != -1)
                        asignarEspacio(espacioDisponible);
                
                return ("TICKET INGRESO AREA: " + this.nombre);
        }
}
