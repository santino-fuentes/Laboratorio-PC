package tp_2.ejercicio_7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sang
 */
public class Cajero implements Runnable
{
        private String nombre;
        private Cliente cliente;
        private long tiempoInicial;
        
        public Cajero(String unNombre, Cliente unCliente, long unTiempoInicial)
        {
                this.nombre = unNombre;
                this.cliente = unCliente;
                this.tiempoInicial = unTiempoInicial;
        }
        
        public String getNombre()
        {
                return (this.nombre);
        }
        
        public void esperarSegundos(int unTiempo)
        {
                try {
                        Thread.sleep(unTiempo * 1000);
                } catch (InterruptedException ex) {
                        Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        @Override
        public void run()
        {
                System.out.println("El cajero " + this.nombre
                        + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                        + cliente.getNombre() + " EN EL TIEMPO: "
                        + (System.currentTimeMillis() - this.tiempoInicial) / 1000
                        + "seg");
                for (int i = 0; i < cliente.getCarroCompra().length; i++) {
                        this.esperarSegundos(cliente.getCarroCompra()[i]);
                        System.out.println(this.nombre + ": Procesado el producto "
                                + (i + 1) + "->Tiempo: "
                                + (System.currentTimeMillis() - this.tiempoInicial) / 1000
                                + "seg");
                }
                System.out.println("El cajero " + this.nombre
                        + " HA TERMINADO DE PROCESAR " + cliente.getNombre()
                        + " EN EL TIEMPO: "
                        + (System.currentTimeMillis() - this.tiempoInicial) / 1000
                        + "seg");
        }
        
        /*
        public void procesarCompra(Cliente cliente, long timeStamp)
        {
                System.out.println("El cajero " + this.nombre
                        + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                        + cliente.getNombre() + " EN EL TIEMPO: "
                        + (System.currentTimeMillis() - timeStamp) / 1000
                        + "seg");
                for (int i = 0; i < cliente.getCarroCompra().length; i++) {
                        this.esperarSegundos(cliente.getCarroCompra()[i]);
                        System.out.println("Procesado el producto "
                                + (i + 1) + "->Tiempo: "
                                + (System.currentTimeMillis() - timeStamp) / 1000
                                + "seg");
                }
                System.out.println("El cajero " + this.nombre
                        + " HA TERMINADO DE PROCESAR " + cliente.getNombre()
                        + " EN EL TIEMPO: "
                        + (System.currentTimeMillis() - timeStamp) / 1000
                        + "seg");
        }
         */
}
