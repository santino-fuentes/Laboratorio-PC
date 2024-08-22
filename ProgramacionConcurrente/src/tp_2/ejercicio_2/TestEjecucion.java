package tp_2.ejercicio_2;

/**
 *
 * @author santino.fuentes
 */
public class TestEjecucion
{
        public static void main (String[] args)
        {
                Thread miHilo = new MiEjecucion();
                miHilo.start();
                //miHilo.run();
                System.out.println("En el main");
        }
}