public abstract class Produto {
    String nome;
    double preco;

    public Produto(String n, double p){
        this.nome = n;
        this.preco = p;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "[PRODUTO] preco: " +this.preco +
    " ,nome: "+ this.nome + " "; 
    }
}
