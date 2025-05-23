public class Livro extends Produto {
    
    String autor;

    public Livro(String n, String a, double p ){
        super(n,p);
        this.autor = a;
    }

    public String getAutor() {
        return autor;
    }
    

    @Override
    public String toString() {
        return super.toString()+ "autor: "+this.autor;
    }

}
