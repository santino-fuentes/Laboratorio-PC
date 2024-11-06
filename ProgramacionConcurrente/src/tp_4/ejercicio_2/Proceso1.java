package tp_4.ejercicio_2;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 *
 * @author santino.fuentes
 */
public class Proceso1 extends Proceso
{
        private final Semaphore sem1;
        private final Semaphore sem2;
        
        public Proceso1(int unIdProceso, HashMap<String, Semaphore> unosSemaforos)
        {
                super(unIdProceso);
                this.sem1 = unosSemaforos.get("sem1");
                this.sem2 = unosSemaforos.get("sem2");
        }
        
        @Override
        public void run()
        {
                try {
                        this.sem2.acquire();
                        accion();
                        this.sem1.release();
                } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                }                
        }
}
