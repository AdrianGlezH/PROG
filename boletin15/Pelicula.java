package boletin15;

public class  Pelicula extends Multimedia{
    String actorpr, actrizpr;

    public Pelicula() {
    }

    public Pelicula(String actorpr, String actrizpr, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actorpr = actorpr;
        this.actrizpr = actrizpr;
    }

    public Pelicula(String actorpr, String actrizpr) {
        this.actorpr = actorpr;
        this.actrizpr = actrizpr;
    }

    public String getActorpr() {
        return actorpr;
    }

    public void setActorpr(String actorpr) {
        this.actorpr = actorpr;
    }

    public String getActrizpr() {
        return actrizpr;
    }

    public void setActrizpr(String actrizpr) {
        this.actrizpr = actrizpr;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "actorpr=" + actorpr + ", actrizpr=" + actrizpr + '}';
    }
    
    
}
