

public class App {
    

    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro("Senhor dos aneis", "tolken", 54);
        Livro l2 = new Livro("Calculo", "James Stuart", 122);
        Livro l3 = new Livro("Calculo 2", "James Stuart", 125);
        Jogo j1 = new Jogo("Xadrez", 34, 13);
        Jogo j2 = new Jogo("Baralho", 24, 11);
        Jogo j3 = new Jogo("Damas", 23, 6);
        Loja lj = new Loja();
        lj.adicionarProduto(l1);
        lj.adicionarProduto(l2);
        lj.adicionarProduto(l3);
        lj.adicionarProduto(j1);
        lj.adicionarProduto(j2);
        lj.adicionarProduto(j3);
       
        lj.imprimirProdutos();

    }
}
