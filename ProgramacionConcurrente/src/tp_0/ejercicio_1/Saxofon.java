package tp_0.ejercicio_1;

/**
 * Implementación del TDA Saxofón.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Saxofon extends Instrumento
{
        @Override
        public String tipo()
        {
                return (super.tipo() + " Saxofón");
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