package tp_3.ejercicio_2;

/**
 *
 * @author santino.fuentes
 */
public class Sanador implements Runnable
{
        private Energia energia;
        
        public Sanador(Energia unEnergia)
        {
                this.energia = unEnergia;
        }
        
        public void sanar()
        {
                System.out.println("Sanando: " + Thread.currentThread().getName());
                this.energia.sanar(3);
                System.out.println("+++ Sana, sana, colita de rana...");
                System.out.println("Energía actual: " + this.energia.getUnidades());
        }
        
        @Override
        public void run()
        {
                try {
                        for (int i = 0; i < 50; i++) {
                                sanar();
                        }
                } catch (Exception e) {
                }
        }
}
