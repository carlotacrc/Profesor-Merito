package dominio;
import java.util.ArrayList;

public abstract class Profesor {

    /////una clase es abstracta porque tiene algun metodo abstracto, que no esta implementado///
    ////creacion atributos, arraylist///
    protected ArrayList<Merito> meritos = new ArrayList<>();
    protected String nombre;

    ///constructor////
    public Profesor(String nombre) {
        this.nombre = nombre;
        ///inicializamos arraylist////
        meritos = new ArrayList<>();
    }

    ////creacion del metodo abstracto
    public abstract double calcularValoracion();

    ////metodo annadir
    public Profesor annadirMerito(Merito m) {
    meritos.add(m);
    return this;
    }

}

    