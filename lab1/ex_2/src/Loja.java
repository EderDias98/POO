import java.util.LinkedList;

public class Loja {
    LinkedList<Produto> produtos = new LinkedList<>();

    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }
    public void imprimirProdutos(){
        for(Produto p : this.produtos){
            
            System.out.println(p.toString());
        }
    }

}
