package tp_4.ejercicio_2;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 *
 * @author santino.fuentes
 */
public class Proceso3 extends Proceso
{
        private final Semaphore sem1;
        private final Semaphore sem3;
        private final Semaphore sem4;
        
        public Proceso3(int unIdProceso, HashMap<String, Semaphore> unosSemaforos)
        {
                super(unIdProceso);
                this.sem1 = unosSemaforos.get("sem1");
                this.sem3 = unosSemaforos.get("sem3");
                this.sem4 = unosSemaforos.get("sem4");
        }
        
        @Override
        public void run()
        {
                try {
                        this.sem1.acquire();
                        accion();
                        this.sem3.release();
                        this.sem4.release();
                } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                }                
        }
}