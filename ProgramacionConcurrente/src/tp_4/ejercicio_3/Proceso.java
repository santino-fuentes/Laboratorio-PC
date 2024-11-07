package tp_4.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Proceso implements Runnable
{
        private final int idProceso;
        private final GestorProcesos gestorProcesos;
        
        public Proceso(int unIdProceso, GestorProcesos unGestorProcesos)
        {
                this.idProceso = unIdProceso;
                this.gestorProcesos = unGestorProcesos;
        }
        
        public int getId()
        {
                return this.idProceso;
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
                                this.gestorProcesos.ejecutarProceso(this);
                        }
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
