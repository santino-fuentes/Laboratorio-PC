package tp_3.ejercicio_2;

/**
 *
 * @author santino.fuentes
 */
public class CriaturaOscura implements Runnable
{
        private Energia energia;
        
        public CriaturaOscura(Energia unaEnergia)
        {
                this.energia = unaEnergia;
        }
        
        private void atacar()
        {
                System.out.println("Atacando: " + Thread.currentThread().getName());
                if(this.energia.drenar(3))
                        System.out.println("--- Masticando cables...");
                System.out.println("Energía actual: " + this.energia.getUnidades());
        }
        
        @Override
        public void run()
        {
                try {
                        for (int i = 0; i < 50; i++) {
                                atacar();
                        }
                } catch (Exception e) {
                }
        }
}
