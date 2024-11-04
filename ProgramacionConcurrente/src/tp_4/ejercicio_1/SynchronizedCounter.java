package tp_4.ejercicio_1;

/**
 *
 * @author santino.fuentes
 */
public class SynchronizedCounter
{
        private int c = 0;

        public synchronized void increment()
        {
                c++;
        }

        public void decrement()
        {
                c--;
        }

        public synchronized int value()
        {
                return c;
        }
}
