package aplicacion;
import dominio.Articulo;
import dominio.Proyecto;
import presentacion.Interfaz;
import dominio.Catedratico;
import dominio.ProfesorTitular;
public class Principal{
    public static void main(String[] args) 
    {

        Interfaz interfaz = new Interfaz();
        String peticion;
        interfaz.procesarPeticion("help");
        do {
            peticion=interfaz.leerPeticion();
        } while (interfaz.procesarPeticion(peticion));
    }
}