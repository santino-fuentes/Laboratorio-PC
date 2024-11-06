package tp_4.ejercicio_2;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 *
 * @author santino.fuentes
 */
public class Main
{
        public static void main(String[] args)
        {
                // Creamos los semáforos
                Semaphore sem1 = new Semaphore(0);
                Semaphore sem2 = new Semaphore(1);
                Semaphore sem3 = new Semaphore(0);
                Semaphore sem4 = new Semaphore(0);
                
                // Mapeamos los semáforos
                HashMap<String, Semaphore> semaforos = new HashMap<>();
                semaforos.put("sem1", sem1);
                semaforos.put("sem2", sem2);
                semaforos.put("sem3", sem3);
                semaforos.put("sem4", sem4);
                
                // Creamos los procesos
                Proceso1 proceso1 = new Proceso1(1, semaforos);
                Proceso2 proceso2 = new Proceso2(2, semaforos);
                Proceso3 proceso3 = new Proceso3(3, semaforos);
                Proceso4 proceso4 = new Proceso4(4, semaforos);
                
                // Mapeamos los procesos
                HashMap<String, Proceso> procesos = new HashMap<>();
                procesos.put("proc1", proceso1);
                procesos.put("proc2", proceso2);
                procesos.put("proc3", proceso3);
                procesos.put("proc4", proceso4);
                
                HashMap<String, Thread> procesosThreads = new HashMap<>();
                for (String key: procesos.keySet()) {
                        procesosThreads.put(key, new Thread(procesos.get(key), "#" + key));
                }
                
                for (Thread hilo: procesosThreads.values()) {
                        hilo.start();
                }
        }
}
