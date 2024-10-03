package tp_3.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Jaula
{
        public static void main(String[] args)
        {
                Plato plato = new Plato();
                Hamaca hamaca = new Hamaca();
                Rueda rueda= new Rueda();
                
                final Hamster[] hamsters = new Hamster[10];
                final Thread[] hamsterThreads = new Thread[10];
                
                for (int i = 0; i < hamsters.length; i++) {
                        hamsters[i] = new Hamster(hamaca, plato, rueda);
                }
                
                for (int j = 0; j < hamsterThreads.length; j++) {
                        hamsterThreads[j] = new Thread(hamsters[j], "Hamster #" + j);                        
                }
                
                for (int k = 0; k < hamsterThreads.length; k++) {
                        hamsterThreads[k].start();
                }
        }
}
