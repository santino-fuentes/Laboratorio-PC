package tp_3.ejercicio_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sang
 */
public class VerificarCuenta implements Runnable
{

        private CuentaBanco cuentaBanco = new CuentaBanco(50);

        private void hacerRetiro(int cantidad) throws InterruptedException
        {
                if (verificarBalance(cantidad)) {
                        System.out.println(Thread.currentThread().getName()
                                + " está realizando un retiro de: "
                                + cantidad + ".");
                        Thread.sleep(1000);
                        if (retirar(cantidad)) // Sección crítica
                                System.out.println(Thread.currentThread().getName() + ": Retiro realizado.");
                        System.out.println(Thread.currentThread().getName()
                                + ": Los fondos son de: " + cuentaBanco.getBalance());
                } else {
                        System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr. "
                                + Thread.currentThread().getName());
                        System.out.println("Su saldo actual es de "
                                + cuentaBanco.getBalance());
                        Thread.sleep(1000);
                }
        }
        
        private synchronized boolean retirar(int unaCantidad)
        {
                return (this.cuentaBanco.retiroBancario(unaCantidad));
        }
        
        private synchronized boolean verificarBalance(int unaCantidad)
        {
                return (this.cuentaBanco.getBalance() >= unaCantidad);
        }
        
        @Override
        public void run()
        {
                for (int i = 0; i <= 3; i++) {
                        try {
                                if(this.cuentaBanco.getBalance() < 0) {
                                        System.out.println("La cuenta está sobregirada.");
                                } else {
                                        System.out.println("Retiro n° "
                                                + (i + 1) + " de "
                                        + Thread.currentThread().getName());
                                        this.hacerRetiro(10);
                                }
                        } catch (InterruptedException ex) {
                                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
        }
}