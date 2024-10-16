package problemas_clasicos.barbero_dormilon.implementacion_synchronized;

/**
 *
 * @author sang
 */
public class Cliente implements Runnable
{
        private final String nombre;
        private final Barberia barberia;
        
        public Cliente(String unNombre, Barberia unaBarberia)
        {
                this.nombre = unNombre;
                this.barberia = unaBarberia;
        }
        
        public String getNombre()
        {
                return this.nombre;
        }
        
        @Override
        public void run()
        {
                try {
                        System.out.println("INICIO " + Thread.currentThread().getName());
                        while (!barberia.intentarIngresar(this)) {
                                System.out.println(Thread.currentThread().getName()
                                + "\n|--> Siempre está llena esta cueva de ratas...");
                        }
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                } finally {
                        System.out.println("FIN " + Thread.currentThread().getName());
                }
        }
}
