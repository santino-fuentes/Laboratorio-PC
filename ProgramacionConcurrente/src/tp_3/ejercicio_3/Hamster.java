/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
                        this.plato.comer();
                        this.rueda.correr();
                } catch (Exception e) {
                }
        }
}
