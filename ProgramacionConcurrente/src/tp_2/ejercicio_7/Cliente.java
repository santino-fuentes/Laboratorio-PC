package tp_2.ejercicio_7;

/**
 *
 * @author sang
 */
public class Cliente
{
        private String nombre;
        private int[] carroCompra;
        
        public Cliente(String unNombre, int[] unCarroCompra)
        {
                this.nombre = unNombre;
                this.carroCompra = unCarroCompra;
        }
        
        public String getNombre()
        {
                return (this.nombre);
        }
        
        public int[] getCarroCompra()
        {
                return (this.carroCompra);
        }
}
