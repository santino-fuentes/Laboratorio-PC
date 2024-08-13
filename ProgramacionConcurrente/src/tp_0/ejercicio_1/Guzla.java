package tp_0.ejercicio_1;

/**
 * Implementación del TDA Guzla.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Guzla extends Instrumento
{
        @Override
        public String tipo()
        {
                return (super.tipo() + " Guzla");
        }
        
        @Override
        public void tocar()
        {
                super.tocar();
                System.out.println(this.tipo());
        }
        
        @Override
        public void afinar()
        {
                super.afinar();
                System.out.println(this.tipo());
        }
}