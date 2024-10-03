package tp_3.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Rueda
{
        public synchronized void correr() throws InterruptedException
        {
                System.out.println(Thread.currentThread().getName()
                        + "\n|Corriendo...\n|Rrr, rrr, rrr, rrr...");
        }
}
