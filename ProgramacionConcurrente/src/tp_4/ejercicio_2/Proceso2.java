package tp_4.ejercicio_2;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 *
 * @author santino.fuentes
 */
public class Proceso2 extends Proceso
{
        private final Semaphore sem2;
        private final Semaphore sem3;
        
        public Proceso2(int unIdProceso, HashMap<String, Semaphore> unosSemaforos)
        {
                super(unIdProceso);
                this.sem2 = unosSemaforos.get("sem2");
                this.sem3 = unosSemaforos.get("sem3");
        }
        
        @Override
        public void run()
        {
                try {
                        this.sem3.acquire();
                        accion();
                        this.sem2.release();
                } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                }                
        }
}