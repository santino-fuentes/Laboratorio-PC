package tp_0.ejercicio_1;

/**
 * Implementación del TDA Piano.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Piano extends Instrumento
{
        @Override
        public String tipo()
        {
                return (super.tipo() + " Piano");
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
