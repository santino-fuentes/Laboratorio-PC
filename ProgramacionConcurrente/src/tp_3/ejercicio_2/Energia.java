package tp_3.ejercicio_2;

/**
 *
 * @author santino.fuentes
 */
public class Energia
{
        private int unidades;
        
        public Energia(int unaCantidad)
        {
                this.unidades = unaCantidad;
        }
        
        public int getUnidades()
        {
                return (this.unidades);
        }
        
        public synchronized boolean drenar(int unaCantidad)
        {
                boolean exito = false;
                if (this.unidades > unaCantidad) {
                        this.unidades = this.unidades - unaCantidad;
                        exito = true;
                }
                return exito;
        }
        
        public synchronized void sanar(int unaCantidad)
        {
                this.unidades = this.unidades + unaCantidad;
        }
}
