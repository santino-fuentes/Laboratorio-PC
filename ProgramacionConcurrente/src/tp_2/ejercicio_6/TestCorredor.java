package tp_2.ejercicio_6;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santino.fuentes
 */
public class TestCorredor
{

        public static void main(String[] args)
        {
                Corredor corredores[] = new Corredor[3];
                for (int i = 0; i < corredores.length; i++) {
                        corredores[i] = new Corredor("#" + (i + 1));
                }
                
                Thread hilosCorredores[] = new Thread[3];
                for (int j = 0; j < hilosCorredores.length; j++) {
                        hilosCorredores[j] = new Thread(corredores[j]);
                }
                
                /*
                ArrayList<Thread> corredores;
                corredores = new ArrayList<>();
                for (int i = 0; i <= 2; i++) {
                        corredores.add(new Thread(new Corredor("#" + (i + 1))));
                }
                corredores.forEach(corredor -> corredor.start()); 
                 */
                
                for (int k = 0; k < hilosCorredores.length; k++) {
                        hilosCorredores[k].start();
                }
                
                for (int l = 0; l < hilosCorredores.length; l++) {
                        try {
                                hilosCorredores[l].join();
                        } catch (InterruptedException ex) {
                                Logger.getLogger(TestCorredor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                int ganador = 0;
                for (int m = 0; m < corredores.length; m++) {
                        if (m > 0 && corredores[m].distanciaRecorrida() > corredores[m - 1].distanciaRecorrida())
                                ganador = m;
                        System.out.println("Distancia recorrida por el corredor "
                                + corredores[m].nombre() + " : " + corredores[m].distanciaRecorrida());
                }
                
                System.out.println("==============================");
                System.out.println("FIN DE LA CARRERA. GANADOR: "
                        + corredores[ganador].nombre());
        }
}
