package problemas_clasicos.barbero_dormilon.implementacion_synchronized;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author sang
 */
public class Barberia
{
        private final String nombre;
        private final int CANTIDAD_LUGARES;
        private Queue<Cliente> sillasEspera;
        
        public Barberia(String unNombre, int cantLugares)
        {
                this.nombre = unNombre;
                this.CANTIDAD_LUGARES = cantLugares;
                this.sillasEspera = new LinkedList<>();
        }
        
        private synchronized boolean hayLugar()
        {
                return (this.sillasEspera.size() <= this.CANTIDAD_LUGARES);
        }
        
        public synchronized boolean intentarIngresar(Cliente unCliente)
        {
                boolean pudoIngresar = false;
                if (this.hayLugar()) {
                        this.sillasEspera.add(unCliente);
                        pudoIngresar = true;
                        System.out.println(Thread.currentThread().getName() +
                                "\n|--> Ingresé a la barbería");
                }
                return pudoIngresar;
        }
        
        private synchronized void atenderCliente(Cliente unCliente)
        {
                System.out.println(Thread.currentThread().getName()
                        + "\n|--> Atendiendo al cliente " + unCliente.getNombre()
                        + "\n|--> Listo amiguito, no te podés quejar, siempre venís los viernes!");
        }
        
        public synchronized void intentarDormir()
        {
                if (this.sillasEspera.isEmpty()) {
                        System.out.println(Thread.currentThread().getName()
                                + "\n|--> Zzz... Zzz... Zzz...");
                } else {
                        atenderCliente(this.sillasEspera.remove());
                }
        }
}
