package problemas_clasicos.barbero_dormilon;

/**
 *
 * @author sang
 */
public class Cliente implements Runnable
{
        private Barberia barberia;
        
        public Cliente(Barberia unaBarberia)
        {
                this.barberia = unaBarberia;
        }
        
        private void entrar()
        {
                if (this.barberia.hayLugar()) {
                        this.barberia.sentarse();
                }
        }
        @Override
        public void run()
        {
                try {
                        this.entrar();
                        
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
