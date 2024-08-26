package tp_2.ejercicio_5;

/**
 *
 * @author santino.fuentes
 */
public class TestMiHilo
{
        public static void main(String[] args)
        {
                System.out.println("Hilo principal iniciando.");
                //Primero, construye un objeto unHilo.
                MiHilo mh = new MiHilo("#1");
                //Luego, construye un hilo de ese objeto.
                Thread nuevoHilo = new Thread(mh);
                //Finalmente, comienza la ejecución del hilo.
                nuevoHilo.start();
                for (int i = 0; i < 50; i++) {
                        System.out.print(" .");
                }
                try {
                        Thread.sleep(100);
                } catch (InterruptedException exc) {
                        System.out.println("Hilo principal interrumpido.");
                }
                System.out.println("Hilo principal finalizado.");
        }
}