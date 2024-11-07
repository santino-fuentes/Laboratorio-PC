package tp_4.ejercicio_3;

import java.util.concurrent.Semaphore;

/**
 * Una primera versión en la que directamente pasamos los semáforos al proceso
 * desde el método main()
 * 
 * @author santino.fuentes
 */
public class ProcesoAlternativo implements Runnable
{
        private final int idProceso;
        private final Semaphore semAnterior;
        private final Semaphore semSiguiente;
        
        // Se instanciaría en el HashMap procesos de main() así:
        // procesos.put("P1", new Proceso(1, sem3, sem1));
        
        public ProcesoAlternativo(int unIdProceso, Semaphore unSemAnterior, Semaphore unSemSiguiente)
        {
                this.idProceso = unIdProceso;
                this.semAnterior = unSemAnterior;
                this.semSiguiente = unSemSiguiente;
        }
        
        public void accion()
        {
                System.out.println("Proceso: "
                        + Thread.currentThread().getName()
                        + "\n|--> En ejecución");
        }
        
        @Override
        public void run()
        {
                try {
                        while (true) {
                                this.semAnterior.acquire();
                                accion();
                                this.semSiguiente.release();
                        }
                } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
