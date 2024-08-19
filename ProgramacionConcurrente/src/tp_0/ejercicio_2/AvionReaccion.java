package tp_0.ejercicio_2;

/**
 *
 * @author sang
 * @version
 */
public class AvionReaccion extends Avion
{
        private int nroMotores;
        
        /**
         * Constructor con todos los parámetros.
         * 
         * @param unaMatricula
         * @param unaEnvergadura
         * @param unAgnoFabricacion
         * @param unNroMotores 
         */
        public AvionReaccion(String unaMatricula,
                double unaEnvergadura,
                int unAgnoFabricacion,
                int unNroMotores)
        {
                super(unaMatricula, unaEnvergadura, unAgnoFabricacion);
                this.nroMotores = unNroMotores;
        }

	public obtenerModulo()
	{
		return (super.obtenerModulo() + this.nroMotores);
	}
}
