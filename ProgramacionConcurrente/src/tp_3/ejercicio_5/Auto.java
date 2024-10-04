package tp_3.ejercicio_5;

/**
 *
 * @author sang
 */
public class Auto extends Vehiculo implements Runnable
{
        private final float combustibleMaximo;
        private float combustibleActual;
        private final float combustibleReserva;
        private final float consumo;
        private Surtidor surtidor;
        
        public Auto(String unaPatente,
                String unaMarca,
                String unModelo,
                float unKm,
                float unCombustibleMaximo,
                float unCombustibleActual,
                float unCombustibleReserva,
                float unConsumo,
                Surtidor unSurtidor)
        {
                super(unaPatente, unaMarca, unModelo, unKm);
                this.combustibleMaximo = unCombustibleMaximo;
                this.combustibleActual = unCombustibleActual;
                this.combustibleReserva = unCombustibleReserva;
                this.consumo = unConsumo;
                this.surtidor = unSurtidor;
        }
        
        /**
         * 
         * @param unosKm
         * @return 
         */
        private float calcularConsumo(float unosKm)
        {
                return (unosKm / this.consumo);
        }
        
        /**
         * Verifica que la cantidad de combustible sea suficiente para
         * recorrer una cantidad de kilómetros
         * 
         * @param unKm
         * @return 
         */
        private boolean puedeAndar(float unKm)
        {
                return (this.combustibleActual > calcularConsumo(unKm));
        }
        
        /**
         * Decrementa la cantidad de combustible según la cantidad de kilómetros
         * recorridos
         * 
         * @param unosKm 
         */
        private void consumirCombustible(int unosKm)
        {
                this.combustibleActual -= calcularConsumo(unosKm);
        }
        
        public void andar(int unKm)
        {
                if (puedeAndar(unKm) && unKm > 0) {
                        this.recorrerKm(unKm);
                        consumirCombustible(unKm);
                        unKm--;//nonononono
                } else {
                        this.surtidor.cargarCombustible(345);
                        andar(unKm);
                }
        }
        
        @Override
        public void run()
        {
                try {
                        System.out.println("Auto " + Thread.currentThread().getName());
                        andar(1);
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
