package tp_2.ejercicio_2;

/**
 *
 * @author santino.fuentes
 */
public class MiEjecucion extends Thread 
{
        public void run()
        {
                ir();
        }
        public void ir()
        {
                hacerMas();
        }
        public void hacerMas()
        {
                System.out.println("En la pila");
        }
}