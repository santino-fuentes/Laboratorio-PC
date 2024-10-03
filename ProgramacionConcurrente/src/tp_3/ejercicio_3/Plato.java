package tp_3.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Plato
{
        public synchronized void comer() throws InterruptedException
        {
                System.out.println(Thread.currentThread().getName()
                        + "\n|Comiendo...\n|Am, am, am, am, am, am, am, am...");
        }
}
