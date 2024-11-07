package tp_4.ejercicio_2;

/**
 *
 * @author santino.fuentes
 */
public abstract class Proceso implements Runnable
{
        private final int idProceso;
        
        public Proceso(int unIdProceso)
        {
                this.idProceso = unIdProceso;
        }
        
        public void accion()
        {
                System.out.println("Proceso: "
                        + Thread.currentThread().getName()
                        + "\n|--> En ejecución");
        }
}
