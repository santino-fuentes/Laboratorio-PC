package tp_3.ejercicio_5;

/**
 *
 * @author sang
 */
public class Surtidor
{
        private final float combustibleMaximo;
        private float combustibleActual;
        
        public Surtidor(float unCombustibleMaximo)
        {
                this.combustibleMaximo = unCombustibleMaximo;
                this.combustibleActual = unCombustibleMaximo;
        }
        
        private boolean combustibleDisponible(float unosLitros)
        {
                return (this.combustibleActual >= unosLitros);
        }
        
        private void surtirCombustible(float unosLitros)
        {
                this.combustibleActual -= unosLitros;
        }
        
        private void reponerCombustible()
        {
                this.combustibleActual = this.combustibleMaximo;
        }
        
        public synchronized String cargarCombustible(float litros)
        {
                String ticket = "TICKET SURTIDOR";
                
                if (combustibleDisponible(litros)) {
                        surtirCombustible(litros);
                        ticket += "\n|--> ¡Carga exitosa!";
                } else {
                        this.reponerCombustible();
                        ticket += "\n|--> Surtidor sin combustible"
                                + "\n|--> Esperando reposición de combustible"
                                + "\n|--> ¡Carga exitosa!";
                }
                
                return ticket;
        }
}
