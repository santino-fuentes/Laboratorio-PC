package problemas_clasicos.barbero_dormilon.implementacion_synchronized;

/**
 *
 * @author sang
 */
public class Barbero implements Runnable
{
        private final Barberia barberia;
        private final short HORAS_LABORALES;
        private float tiempoActivo;
        
        public Barbero(Barberia unaBarberia)
        {
                this.barberia = unaBarberia;
                this.HORAS_LABORALES = 8;
        }
        
        /**
         * La variable {@code tiempoActivo} acumula una milésima de segundo
         * en cada iteración, simulando el paso del tiempo para llegar
         * a cubrir las horas laborales del barbero
         */
        @Override
        public void run()
        {
                try {
                        System.out.println("INICIO " + Thread.currentThread().getName());
                        this.tiempoActivo = 0;
                        while (tiempoActivo < HORAS_LABORALES) {
                                this.barberia.intentarDormir();
                                this.tiempoActivo += 0.001;
                        }
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                } finally {
                        System.out.println("FIN " + Thread.currentThread().getName());
                }
        }
}
