package tp_2.ejercicio_7;

/**
 *
 * @author sang
 */
public class Main
{
        public static void main(String[] args)
        {
                Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
                Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});
                // Tiempo inicial de referencia
                long initialTime = System.currentTimeMillis();
                Cajero cajero1 = new Cajero("Cajero 1", cliente1, initialTime);
                Cajero cajero2 = new Cajero("Cajero 2", cliente2, initialTime);
                Thread hiloCajero1 = new Thread(cajero1);
                Thread hiloCajero2 = new Thread(cajero2);
                /*
                cajero1.procesarCompra(cliente1, initialTime);
                cajero1.procesarCompra(cliente2, initialTime);
                 */
                hiloCajero1.start();
                hiloCajero2.start();
        }
}
