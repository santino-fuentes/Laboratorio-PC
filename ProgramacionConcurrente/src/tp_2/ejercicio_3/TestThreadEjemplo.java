package tp_2.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class TestThreadEjemplo
{
        public static void main (String [] args)
        {
                new ThreadEjemplo("Maria Jose").start();
                new ThreadEjemplo("Jose Maria").start();
                System.out.println("Termina thread main");
        }
}
