package tp_3.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Hamster implements Runnable
{
        private Hamaca hamaca;
        private Plato plato;
        private Rueda rueda;
        
        public Hamster(Hamaca unaHamaca, Plato unPlato, Rueda unaRueda)
        {
                this.hamaca = unaHamaca;
                this.plato = unPlato;
                this.rueda = unaRueda;
        }
        
        @Override
        public void run()
        {
                try {
                        System.out.println(Thread.currentThread().getName()
                                + " entró a la jaula (por voluntad propia, obviamente).");
                        this.hamaca.hamacarse();
                        Thread.sleep(1000);
                        this.plato.comer();
                        Thread.sleep(1000);
                        this.rueda.correr();
                        Thread.sleep(1000);
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
