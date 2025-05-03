package view;

import model.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(123, "Boneca",54.6, 200);

        produto.exibirInfo();
    }
}
