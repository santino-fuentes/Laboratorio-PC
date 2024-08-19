package tp_0.ejercicio_2;

/**
 *
 * @author sang
 * @version
 */
public class AvionComercial extends Avion
{
        private double potencia;
        private int capacidadPasajeros;
        
        /**
         * Constructor con todos los parámetros.
         * 
         * @param unaMatricula
         * @param unaEnvergadura
         * @param unAgnoFabricacion
         * @param unaPotencia
         * @param unaCapacidadPasajeros 
         */
        public AvionComercial(String unaMatricula,
                double unaEnvergadura,
                int unAgnoFabricacion,
                double unaPotencia,
                int unaCapacidadPasajeros)
        {
                super(unaMatricula, unaEnvergadura, unAgnoFabricacion);
                this.potencia = unaPotencia;
                this.capacidadPasajeros = unaCapacidadPasajeros;
        }

	public obtenerModulo()
	{
		return (super.obtenerModulo() + this.potencia + this.capacidadPasajeros);
	}
}
