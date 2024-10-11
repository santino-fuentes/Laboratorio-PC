package tp_3.ejercicio_6;

import java.util.Random;

/**
 *
 * @author sang
 */
public class LibroContable
{
        private int sumaTotal;
        private int ventas[];
        
        /**
         * @see https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/random/RandomGenerator.html#nextInt(int,int)
         */
        public LibroContable(int unaLongitud)
        {
                this.sumaTotal = 0;
                Random nroRandom = new Random();
                this.ventas = new int[unaLongitud];
                for (int i = 0; i < ventas.length; i++) {
                        ventas[i] = nroRandom.nextInt(1, 11);
                }
        }
        
        public synchronized String sumar(int unaPosicion)
        {
                this.sumaTotal += this.ventas[unaPosicion];
                return ("\n|--> Suma total actual: " + this.sumaTotal);
        }
        
        public int obtenerSumaTotal()
        {
                return (this.sumaTotal);
        }
}
