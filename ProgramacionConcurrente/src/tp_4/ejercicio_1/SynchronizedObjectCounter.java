package tp_4.ejercicio_1;

/**
 *
 * @author santino.fuentes
 */
public class SynchronizedObjectCounter
{
        private int c = 0;

        public void increment()
        {
                synchronized (this) {
                        c++;
                } // Este elemento debe ser casteado a Integer
        }

        public void decrement()
        {
                synchronized (this) {
                        c--;
                }
        }

        public int value()
        {
                return c;
        }
}
