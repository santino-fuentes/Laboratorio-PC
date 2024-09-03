package tp_3.ejercicio_1;

/**
 *
 * @author sang
 */
public class CuentaBanco
{

        private int balance;

        public CuentaBanco(int unDeposito)
        {
                this.balance = unDeposito;
        }

        public int getBalance()
        {
                return (this.balance);
        }

        public boolean retiroBancario(int retiro)
        {
                boolean exito = false;
                if (this.balance > 0) {
                        this.balance = this.balance - retiro;
                        exito = true;
                }
                return (exito);
        }
}
