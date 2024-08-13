package tp_0.ejercicio_1;

/**
 * Implementación del TDA Instrumento.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public abstract class Instrumento
{
        private final String tipo = "Instrumento";
        
        public String tipo()
        {
                return (this.tipo);
        }
        
        public void tocar()
        {
                System.out.print("Tocando ");
        }
        
        public void afinar()
        {
                System.out.print("Afinando ");
        }
}