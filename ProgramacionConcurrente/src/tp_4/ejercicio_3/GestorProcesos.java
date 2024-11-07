package tp_4.ejercicio_3;

import java.util.concurrent.Semaphore;

/**
 * Implementación de un gestor de procesos, responsable de orquestar los semáforos
 * según la id del proceso a ejecutar.
 * 
 * @author santino.fuentes
 */
public class GestorProcesos
{
        private final Semaphore sem1;
        private final Semaphore sem2;
        private final Semaphore sem3;
        
        public GestorProcesos()
        {
                this.sem1 = new Semaphore(0);
                this.sem2 = new Semaphore(0);
                this.sem3 = new Semaphore(1);
        }
        
        public void ejecutarProceso(Proceso unProceso)
        {
                try {
                        switch (unProceso.getId()) {
                        case 1:
                                this.sem3.acquire();
                                unProceso.accion();
                                this.sem1.release();
                                break;
                        case 2:
                                this.sem2.acquire();
                                unProceso.accion();
                                this.sem3.release();
                                break;
                        case 3:
                                this.sem1.acquire();
                                unProceso.accion();
                                this.sem2.release();
                                break;
                        }
                } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
