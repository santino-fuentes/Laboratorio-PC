package tp_3.ejercicio_6;

/**
 *
 * @author sang
 */
public class Contador implements Runnable
{
        private LibroContable libroContable;
        private final int DIA_INICIO;
        private final int DIA_FIN;
        
        /**
         * La responsbilidad de un contador es contar solo un rango de días
         * del arreglo del libro contable
         * 
         * @param unLibroContable
         * @param unDiaInicio
         * @param unDiaFin
         */
        public Contador(LibroContable unLibroContable, int unDiaInicio, int unDiaFin)
        {
                this.libroContable = unLibroContable;
                this.DIA_INICIO = unDiaInicio;
                this.DIA_FIN = unDiaFin;
        }
        
        /**
         * Cuenta solo los elementos del arreglo que son de su responsabilidad
         * sumandolos en el libro contable
         */
        private void contar()
        {
                for (int i = DIA_INICIO; i < DIA_FIN; i++) {
                        System.out.println(Thread.currentThread().getName()
                                + this.libroContable.sumar(i));
                }
        }
        
        @Override
        public void run()
        {
                try {
                        System.out.println("INICIA "
                                        + Thread.currentThread().getName());
                        this.contar();
                        System.out.println("FINALIZA "
                                        + Thread.currentThread().getName());
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
