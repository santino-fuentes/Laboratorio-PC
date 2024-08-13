package tp_0.ejercicio_1;

/**
 * Implementación del TDA Guitarra.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Guitarra extends Instrumento
{
        @Override
        public String tipo()
        {
                return (super.tipo() + " Guitarra");
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