public class Jogo extends Produto {
    String nome;
    double preco;
    int idadeMinima;

    public Jogo(String n, double p, int i){
        super(n,p);
        this.idadeMinima =i;
    } 
    public int getIdadeMinima() {
        return idadeMinima;
    }
    @Override
    public String toString() {
        return super.toString()+"idade minima: "+ this.idadeMinima;
    }

}
