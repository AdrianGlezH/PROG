package boletin14;

public class Publicacion {
   
    private int codigo;
    private String titulo;
    private int ano;

    public Publicacion(int codigo, String titulo, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + '}';
    }
    
    
}
