package problemas_clasicos.barbero_dormilon.implementacion_lock;

/**
 *
 * @author sang
 */
public class Barbero implements Runnable
{
        private final String nombre;
        private final Barberia barberia;
        
        public Barbero(Barberia unaBarberia, String unNombre)
        {
                this.barberia = unaBarberia;
                this.nombre = unNombre;
        }
        
        @Override
        public void run()
        {
                try {
                        this.barberia.dormir();
                        
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
