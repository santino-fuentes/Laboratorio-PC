package tp_1.ejercicio_8;

/**
 *
 * @author sang
 */
public class PruebaExcep
{
        public void verificarEdad(int unaEdad) throws Exception
        {
                if (unaEdad < 18) {
                        throw new Exception("La persona es menor de edad");
                }
        }
        
        public void verificarNroRuleta(int unNro)
        {
                
        }
}
