package tp_3.ejercicio_5;

/**
 *
 * @author sang
 */
public class CiudadGotica
{
        public static void main(String[] args)
        {
                Surtidor surtidorDeLaYPF = new Surtidor(10000);
                Auto autos[] = new Auto[5];
                Thread autosThread[] = new Thread[5];
                
                for (int i = 0; i < autos.length; i++) {
                        autos[i] = new Auto("AAA-00" + i,
                                "Ford",
                                "Falcon",
                                0,
                                40,
                                40,
                                5,
                                6,
                                surtidorDeLaYPF);
                }
                
                for (int j = 0; j < autosThread.length; j++) {
                        autosThread[j] = new Thread(autos[j], "Auto #" + j);
                }
                
                for (int k = 0; k < autosThread.length; k++) {
                        autosThread[k].start();
                }
        }
}
