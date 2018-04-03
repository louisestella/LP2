public class Biblioteca{

    public static void main(String[] args){
        Estante e1 = new Estante( "00A1" );
        e1.addLivro( new Livro( "Plutao", "drama", "Suel, Lismax", "123wer5", 2018 ));
        e1.addLivro( new Livro( "Mercurio", "poesia", "Goulart, Leo", "456qgr9", 2016 ));
        e1.addLivro( new Livro( "Venus", "auto-ajuda", "Cohen, Arthur", "345aqs7", 2010 ));
        e1.addLivro( new Livro( "Terra", "ficcao cientifica", "Rego, Allan", "345thj9", 2011 ));
        e1.addLivro( new Livro( "Marte", "fantasia", "Stella, Louise", "321rwe9", 1978 ));

          
        Estante e2 = new Estante( "00A2" );
        e2.addLivro( new Livro( "Saturno", "drama", "Suel, Lismax", "923wer5", 2018 ));
        e2.addLivro( new Livro( "Jupiter", "poesia", "Goulart, Leo", "256qgr9", 2016 ));
        e2.addLivro( new Livro( "Netuno", "auto-ajuda", "Cohen, Arthur", "145aqs7", 2010 ));
        e2.addLivro( new Livro( "Urano", "ficcao cientifica", "Rego, Allan", "245thj9", 2011 ));
        e2.addLivro( new Livro( "Lua", "terror", "Rodrigues, Bianca", "222rwe9", 1991 ));

    }

}
