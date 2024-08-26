package tp_2.ejercicio_6;

import java.util.ArrayList;

/**
 *
 * @author santino.fuentes
 */
public class TestCorredor
{

        public static void main(String[] args)
        {
                /*
                Thread corredores[] = new Thread[20];
                for (int i = 0; i < corredores.length; i++) {
                        corredores[i] = new Thread(new Corredor("#" + (i + 1)));
                        corredores[i].start();
                }
                 */
                ArrayList<Thread> corredores;
                corredores = new ArrayList<>();
                for (int i = 0; i <= 2; i++) {
                        corredores.add(new Thread(new Corredor("#" + (i + 1))));
                }
                corredores.forEach(corredor -> corredor.start());
        }
}
