package dominio;

public abstract class Merito {
    ////////atributo/////////
    protected String titulo;

    ////////constructor////
    public Merito(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /////////creamos metodo valorar que es abstracto///////
    public abstract double valorar();

}
