package tp_3.ejercicio_2;

/**
 *
 * @author sang
 */
public class Main
{
        public static void main(String[] args)
        {
                Energia energia = new Energia(100);
                
                CriaturaOscura matiasinho = new CriaturaOscura(energia);
                CriaturaOscura franquinho = new CriaturaOscura(energia);
                Sanador spiderman = new Sanador(energia);
                Sanador linusTorvalds = new Sanador(energia);
                
                Thread personajes[] = new Thread[4];
                personajes[0] = new Thread(matiasinho, "Matiasinho");
                personajes[2] = new Thread(franquinho, "Franquinho");
                personajes[1] = new Thread(spiderman, "Spiderman");
                personajes[3] = new Thread(linusTorvalds, "DIOS");
                
                for (int i = 0; i < personajes.length; i++) {
                        personajes[i].start();
                }
        }
}
