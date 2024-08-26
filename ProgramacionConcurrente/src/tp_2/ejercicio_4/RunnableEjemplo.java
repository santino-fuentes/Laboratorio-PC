package tp_2.ejercicio_4;

/**
 *
 * @author santino.fuentes
 */
public class RunnableEjemplo implements Runnable
{
        String nombre;
        
        public RunnableEjemplo(String unNombre)
        {
                this.nombre = unNombre;
        }
        
        @Override
        public void run()
        {
                for (int i = 0; i < 10 ; i++)
                        System.out.println(i + " " + this.nombre);
                System.out.println("Termina thread " + this.nombre);
        }
}