package tp_4.ejercicio_3;

import java.util.HashMap;

/**
 *
 * @author santino.fuentes
 */
public class Main
{
        public static void main(String[] args)
        {
                GestorProcesos gestorProcesos = new GestorProcesos();
                
                // Creamos y mapeamos los procesos
                HashMap<String, Proceso> procesos = new HashMap<>();
                procesos.put("P1", new Proceso(1, gestorProcesos));
                procesos.put("P2", new Proceso(2, gestorProcesos));
                procesos.put("P3", new Proceso(3, gestorProcesos));
                
                // Creamos y mapeamos los hilos
                HashMap<String, Thread> procesosThreads = new HashMap<>();
                for (String key : procesos.keySet()) {
                        procesosThreads.put(key, new Thread(procesos.get(key), "#" + key));
                }
                
                // Iniciamos los hilos
                for (Thread unHilo : procesosThreads.values()) {
                        unHilo.start();
                }
        }
}
