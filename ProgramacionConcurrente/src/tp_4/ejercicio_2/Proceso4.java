package tp_4.ejercicio_2;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 *
 * @author santino.fuentes
 */
public class Proceso4 extends Proceso
{
        private final Semaphore sem4;
        
        public Proceso4(int unIdProceso, HashMap<String, Semaphore> unosSemaforos)
        {
                super(unIdProceso);
                this.sem4 = unosSemaforos.get("sem4");
        }
        
        @Override
        public void run()
        {
                try {
                        this.sem4.acquire();
                        accion();
                } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                }                
        }
}