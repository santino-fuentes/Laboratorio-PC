package tp_3.ejercicio_6;

/**
 *
 * @author sang
 */
public class Oficina
{
        public static void main(String[] args)
        {
                int LONGITUD_ARREGLO = 50000;
                int CANTIDAD_CONTADORES = 5;
                int RANGO_CONTADOR = LONGITUD_ARREGLO / CANTIDAD_CONTADORES;
                
                LibroContable libroContable = new LibroContable(LONGITUD_ARREGLO);
                Contador contadores[] = new Contador[CANTIDAD_CONTADORES];
                Thread contadoresThread[] = new Thread[CANTIDAD_CONTADORES];
                
                for (int i = 0; i < contadores.length; i++) {
                        contadores[i] = new Contador(libroContable, RANGO_CONTADOR * i, RANGO_CONTADOR * (i + 1));
                }
                
                for (int j = 0; j < contadoresThread.length; j++) {
                        contadoresThread[j] = new Thread(contadores[j], "Contador #" + j);
                }
                
                for (int k = 0; k < contadoresThread.length; k++) {
                        contadoresThread[k].start();
                }
        }
}
