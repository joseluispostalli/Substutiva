
package entidades;

public final class Musica {
    
    private String nome;
    private int duracao;
    private Autor autor;
    private String genero;
    
    Musica musica1 = new Musica("jarangostango",'115' ,"Armandinho" ,"pop");

    
    
    public Musica(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    

}
