package tp_2.ejercicio_4;

/**
 *
 * @author santino.fuentes
 */
public class TestRunnableEjemplo
{
        public static void main (String [] args)
        {
                Thread hilo1 = new Thread(new RunnableEjemplo("María José"));
                Thread hilo2 = new Thread(new RunnableEjemplo("José María"));
                hilo1.start();
                hilo2.start();
                System.out.println("Termina thread main");
        }
}
