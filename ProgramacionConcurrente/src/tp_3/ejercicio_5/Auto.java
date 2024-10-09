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
         * Verifica si no se ha llegado a la reserva
         * 
         * @return 
         */
        private boolean tieneCombustible()
        {
                return (this.combustibleActual > this.combustibleReserva);
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
        
        /**
         * Simula el recorrido de una cantidad de km del auto
         * 
         * @param unKm 
         */
        public void andar(int unKm)
        {
                while (unKm > 0) {
                        if (tieneCombustible()) {
                                System.out.println(Thread.currentThread().getName()
                                        + "\n|--> Andando 1 km");
                                recorrerKm(1);
                                consumirCombustible(1);
                                unKm--;
                        } else {
                                String ticketSurtidor = this.surtidor.cargarCombustible(
                                        calcularConsumo(unKm));
                                System.out.println(Thread.currentThread().getName()
                                        + "\n|--> Parada en surtidor"
                                        + "\n|--> " + ticketSurtidor);
                        }
                }
        }
        
        @Override
        public void run()
        {
                try {
                        System.out.println("INICIO Auto " + Thread.currentThread().getName());
                        andar(20);
                        System.out.println("FINALIZA Auto " + Thread.currentThread().getName());
                } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                }
        }
}
