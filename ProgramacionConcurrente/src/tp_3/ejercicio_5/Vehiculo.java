package tp_3.ejercicio_5;

/**
 *
 * @author sang
 */
public abstract class Vehiculo
{
        private String patente;
        private String marca;
        private String modelo;
        private float km;
        
        public Vehiculo(String unaPatente,
                String unaMarca,
                String unModelo,
                float unKm)
        {
                this.patente = unaPatente;
                this.marca = unaMarca;
                this.modelo = unModelo;
                this.km = unKm;
        }
        
        public void recorrerKm(float unKm)
        {
                this.km += unKm;
        }
}
