package tp_0.ejercicio_2;

/**
 *
 * @author sang
 * @version
 */
public class AvionHelice extends Avion {
        private double potencia;
        
        /**
         * Constructor con todos los parámetros.
         * 
         * @param unaMatricula
         * @param unaEnvergadura
         * @param unAgnoFabricacion
         * @param unaPotencia 
         */
        public AvionHelice(String unaMatricula,
                double unaEnvergadura,
                int unAgnoFabricacion,
                double unaPotencia)
        {
                super(unaMatricula, unaEnvergadura, unAgnoFabricacion);
                this.potencia = unaPotencia;
        }

	public obtenerModulo()
	{
		return (super.obtenerModulo() + this.potencia);
	}
}
