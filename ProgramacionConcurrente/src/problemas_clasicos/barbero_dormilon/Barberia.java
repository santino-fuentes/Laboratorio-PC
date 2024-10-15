package problemas_clasicos.barbero_dormilon;

/**
 *
 * @author sang
 */
public class Barberia
{
        private final String nombre;
        private boolean sillonBarbero;
        private boolean sillasEspera[];
        
        public Barberia(String unNombre, int cantLugares)
        {
                this.nombre = unNombre;
                this.sillasEspera = new boolean[cantLugares];
                this.sillonBarbero = false;
                
                for (int i = 0; i < sillasEspera.length; i++) {
                        sillasEspera[i] = false;
                }
        }
        
        public synchronized boolean hayLugar()
        {
                boolean disponible = false;
                
                for (int i = 0; i < sillasEspera.length; i++) {
                        if (sillasEspera[i])
                                disponible = true;
                }
                
                return disponible;
        }
}
