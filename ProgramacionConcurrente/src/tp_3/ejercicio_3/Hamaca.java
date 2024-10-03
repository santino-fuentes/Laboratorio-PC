package tp_3.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Hamaca
{
        public synchronized void hamacarse() throws InterruptedException
        {
                System.out.println(Thread.currentThread().getName()
                        + "\n|Descansando...\n|Zzz, zzz, zzz...");
        }
}
