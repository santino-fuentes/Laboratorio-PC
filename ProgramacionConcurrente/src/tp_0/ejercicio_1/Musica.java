package tp_0.ejercicio_1;

/**
 * Implementación del TDA Música.
 * 
 * @author santino.fuentes
 * @version 1.0
 */
public class Musica
{
        // No importa el tipo de Instrumento,
        // seguirá funcionando debido a Polimorfismo:
        static void tocarTodo(Instrumento[] instrumentos)
        {
                for (Instrumento instrumento : instrumentos)
                        instrumento.tocar();
        }
        
        static void afinarTodo(Instrumento[] instrumentos)
        {
                for (Instrumento instrumento : instrumentos)
                        instrumento.afinar();
        }
        /**
         * Comparativa entre iteradores
         * 
         * Java `for loop`:
         * for (int i = 0; i < instrumentos.length; i++)
         *      instrumentos[i].afinar();
         * 
         * Java `enhanced for loop`:
         * for (Instrumento unInstrumento : instrumentos ) {
         *      unInstrumento.afinar();
         * }
         * 
         * Smalltalk `do`:
         * instrumentos do: [ :unInstrumento | unInstrumento afinar ]
         */
        
        public static void main(String[] args)
        {
                Instrumento[] orquesta = new Instrumento[5];
                int i = 0;
                // Up-casting al asignarse el Arreglo
                orquesta[i++] = new Guitarra();
                orquesta[i++] = new Piano();
                orquesta[i++] = new Saxofon();
                orquesta[i++] = new Guzla();
                orquesta[i++] = new Ukelele();
                afinarTodo(orquesta);
                tocarTodo(orquesta);
        }
}