package tp_3.ejercicio_4;

/**
 *
 * @author sang
 */
public class Visitante implements Runnable
{
        private Area[] areas;
        
        public Visitante(Area[] unasAreas)
        {
                this.areas = unasAreas;
        }
        
        public void run()
        {
                try {
                        System.out.println(Thread.currentThread().getName()
                                + " Comprando tickets al área: ");
                        
                        for (int i = 0; i < areas.length; i++) {
                                Area area = areas[i];
                        }
                } catch (Exception e) {
                }
        }
}
