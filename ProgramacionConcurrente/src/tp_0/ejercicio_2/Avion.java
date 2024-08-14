package tp_0.ejercicio_2;

/**
 * Implementación del TDA Avión.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Avion
{
        private int agnoFabricacion;
        private double envergadura;
        private String matricula;
        
        public Avion(String unaMatricula, double unaEnvergadura, int unAgnoFabricacion)
        {
                this.agnoFabricacion = unAgnoFabricacion;
                this.envergadura = unaEnvergadura;
                this.matricula = unaMatricula;
        }
        
        public double obtenerEnvergadura()
        {
                return (this.envergadura);
        }
}
