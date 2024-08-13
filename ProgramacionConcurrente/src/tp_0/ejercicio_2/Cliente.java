package tp_0.ejercicio_2;

/**
 * Implementación del TDA Cliente.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Cliente
{
        private int nroDNI;
        private String nombre, apellido;
        
        public Cliente(String unNombre, String unApellido, int unNroDNI) {
                this.nombre = unNombre;
                this.apellido = unApellido;
                this.nroDNI = unNroDNI;
        }
}