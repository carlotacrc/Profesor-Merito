package dominio;

public class Catedratico extends Profesor  {
    
    ////constructor////
    public Catedratico(String nombre) {
        super(nombre);
    }

    ///metodo valorar//
    public double calcularValoracion() {

    float suma = 0;
    for(Merito m : meritos) {
        suma += Math.pow(m.valorar(),2);
    }
    return Math.pow(suma/4, 05);
    
    }
}
