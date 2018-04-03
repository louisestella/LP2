import java.util.ArrayList;


public class Estante {
    private String codigo;
    private ArrayList<Livro> lista;

    public Estante( String codigo ){
        this.codigo = codigo;        
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo( String codigo ){
        this.codigo = codigo;
    }

    public void addLivro( Livro l ){
        lista.add( l );
    }

    public void removeLivro ( Livro l ){
        lista.remove( l );
    }

}

