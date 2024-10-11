import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Ventilador", 69.99,15 );
        Produto produto2 = new Produto("Ar-condicionado", 310.99, 10);
        Produto produto3 = new Produto("Rodo", 23.99,24);
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("chocolate",
                5.99, 43, "25/07/2025");

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produtoPerecivel1);
        //System.out.println(listaProdutos.size());
        //System.out.println(listaProdutos.getFirst().getNome());
        //System.out.println(listaProdutos.getFirst().toString());
        for (Produto produto : listaProdutos) { // Para cada objeto Produto na listaProdutos, faça o que está no bloco de código abaixo
            System.out.println(produto.getNome());  // Exibir o nome do produto
            System.out.println(produto.toString()); // Exibir as informações do produto usando toString()
        }

        System.out.println(produtoPerecivel1.toString());


    }
}
