public class Livro{
    private String titulo, genero, autor, isbn;
    private int ano;

    public Livro( String titulo, String genero, String autor, String isbn, int ano ){
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
        
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo( String titulo ){
        this.titulo = titulo;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero( String genero ){
        this.genero = genero;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor( String autor ){
        this.autor = autor;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setIsbn( String isbn ){
        this.isbn = isbn;

    }

    public int getAno(){
        return this.ano;
    }

    public void setAno( int ano ){
        this.ano = ano;
    }

}

