/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author dam1
 */
public class Libro {
    //atributos
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //metodo por defecto      
    public Libro(){             
    }           
    
    //constructor paarametrizado
    
    public  Libro(String titulo1, String autor1, int ano1, short numPaginas1){
        titulo=titulo1;
        autor=autor1;       //sobrecarga del constructor, tituloo va a recibir a titulo1
        ano=ano1;           //this.ano=ano  lo q recibo en ano lo pasa a this.ano
        numPaginas=numPaginas1;
    }
    //métodos de acceso
    
    public void setTitulo (String titulo1){
    titulo = titulo1;
    }
    
    public String getTitulo(){
    return titulo;
    }
    
    
    public void setAutor (String autor){
    autor = autor;
    }
    
     public String getAutor(){
    return autor;
     }

    public void setAno (int ano){
    ano = ano;
    }

     public int getAno(){
     return ano;    
    }
     
    public void setnumPaginas (short numPaginas){
    numPaginas = numPaginas;
    }
    
    public short getnumPaginas (){
    return numPaginas;
    }
    
    public void amosar(){
        
       //System.out.println("autor" + obxlibro2.getTitulo(autor) + "ano" + obxlibro2.getAno(ano) + "número de páginas" + obxlibro2.getnumPaginas(numPaginas) );
        System.out.println("titulo"  + titulo +  "\n autor"  + autor  +  "\n ano"  + ano +  "n/ numPaginas"  +  numPaginas );  
    }                                                                          //4 metodo amosar non devolve nada e visualiza caracteristicas libro

    


}
