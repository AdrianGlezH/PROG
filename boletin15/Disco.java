package boletin15;

public class Disco extends Multimedia{
    String genero;

    public Disco() {
    }

    public Disco(String genero, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public Disco(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco{" + "genero=" + genero + '}';
    }
    
}
