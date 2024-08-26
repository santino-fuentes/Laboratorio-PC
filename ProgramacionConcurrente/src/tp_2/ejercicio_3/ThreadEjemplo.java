package tp_2.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class ThreadEjemplo extends Thread
{
        public ThreadEjemplo(String str)
        {
                super(str);
        }
        
        @Override
        public void run()
        {
                for (int i = 0; i < 10 ; i++)
                        System.out.println(i + " " + getName());
                System.out.println("Termina thread " + getName());
        }
}