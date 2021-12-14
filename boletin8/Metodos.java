package boletin8;

 class Metodos {
    String nome;
    float ventas;
    public void Ventas(){
        if(ventas<=100)
            System.out.println(nome+" e de baixa necesidade");
        else if(ventas>100&&ventas<=500)
            System.out.println(nome+" e de media necesidade");
        else if(ventas>500&&<=1000)
            System.out.println(nome+" e de alta necesidade");
        else
            System.out.println(nome+" e de primeira necesidade");
 }

    public Metodos(String nome, float ventas) {
        this.nome = nome;
        this.ventas = ventas;
    }
}
