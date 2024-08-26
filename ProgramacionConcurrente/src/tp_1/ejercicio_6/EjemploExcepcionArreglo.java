package tp_1.ejercicio_6;

/**
 *
 * @author sang
 */
public class EjemploExcepcionArreglo
{
        
        public static double acceso_por_indice(double[] v, int j) throws RuntimeException
        {
                try {
                        if ((0 <= j) && (j <= v.length)) {
                                return v[j];
                        } else {
                                throw new RuntimeException("El indice " + j + " no existe en el vector");
                        }
                } catch (RuntimeException exc) {
                        throw exc;
                }
        }
        
        public static double accesoPorIndice(double[] unAreglo, int unIndice) throws RuntimeException
        {
                if ((0 <= unIndice) && (unIndice <= unAreglo.length)) {
                        return unAreglo[unIndice];
                } else {
                        throw new RuntimeException("El indice " + unIndice + " no existe en el vector");
                }
        }
        
        // Desde el siguiente cliente “main”:
        public static void main(String[] args)
        {
                double[] v = new double[15];
                //acceso_por_indice(v, 16);
                
                try {
                        accesoPorIndice(v, 16);
                } catch (Exception ex) {
                        ex.printStackTrace();
                }
        }
}
