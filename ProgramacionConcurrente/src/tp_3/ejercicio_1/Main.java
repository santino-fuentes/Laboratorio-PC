package tp_3.ejercicio_1;

/**
 *
 * @author sang
 */
public class Main
{
        public static void main(String[] args)
        {
                VerificarCuenta vc = new VerificarCuenta();
                Thread luis = new Thread(vc, "Luis");
                Thread manuel = new Thread(vc, "Manuel");
                luis.start();
                manuel.start();
        }
}
