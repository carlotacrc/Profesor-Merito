package dominio;

public class Articulo extends Merito {

    ////////////atributos/////////
    protected double impacto;

    //////////constructor////////////
    public Articulo(String titulo, double impacto) {
    super(titulo);
    this.impacto = impacto;   
    }

    /////////implementamos metodo valorar/////
    public double valorar() {
        return impacto; 
    }

    public double getImpacto() {
        return impacto;
    }

    public void setImpacto(double impacto) {
        this.impacto = impacto;
    }

}
