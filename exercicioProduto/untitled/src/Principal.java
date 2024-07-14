import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Arroz", 5.99, 12, "01-04-2025");
        Produto produto2 = new Produto("Feijão", 3.89, 8, "31-08-2024");
        Produto produto3 = new Produto("Carne", 10.59, 3, "12-03-2025");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Esta lista possui " + listaProdutos.size() + " Produtos.");

        for (Produto produtos : listaProdutos){
            System.out.println(produtos);
        }

        Produto produtoNovo = new Produto("Sardinha", 2.50, 6, "03-10-2024");

        listaProdutos.add(produtoNovo);

        Produto produto4 = new ProdutoPerecivel("Feijão Enlatado", 3.50, 6, "27-07-2024");
        System.out.println(produto4);


    }
}
