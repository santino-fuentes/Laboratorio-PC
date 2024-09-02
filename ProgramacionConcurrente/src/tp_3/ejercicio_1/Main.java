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
                Thread Luis = new Thread(vc, "Luis");
                Thread Manuel = new Thread(vc, "Manuel");
                Luis.start();
                Manuel.start();
        }
}
