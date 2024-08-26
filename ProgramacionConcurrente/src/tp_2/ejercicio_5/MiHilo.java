package tp_2.ejercicio_5;

/**
 *
 * @author santino.fuentes
 */
public class MiHilo implements Runnable
{
        String nombreHilo;
        
        public MiHilo(String unNombre){
                this.nombreHilo = unNombre;
        }
        
        //Punto de entrada del hilo
        //Los hilos comienzan a ejecutarse aquí
        public void run()
        {
                System.out.println("Comenzando " + nombreHilo);
                try {
                        for (int contar=0; contar<10; contar++){
                                Thread.sleep(400);
                                System.out.println("En " + nombreHilo + ", el recuento " + contar);
                        }
                } catch (InterruptedException exc) {
                        System.out.println(nombreHilo + "Interrumpido.");
                }
                System.out.println("Terminando " + nombreHilo);
        }
}