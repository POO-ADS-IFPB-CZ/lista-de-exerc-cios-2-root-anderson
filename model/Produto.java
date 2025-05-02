package model;


import java.util.Scanner;

public class Produto {
    private final int codigo;
    private final String nome;
    private double preco;
    private final int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.setPreco(preco);
        this.estoque = estoque;

    }

    public void exibirInfo() {
        System.out.println("===INFORMAÇÕES DO PRODUTO===");
        System.out.println("CODIGO: " + getCodigo());
        System.out.println("NOME: " + getNome());
        System.out.println("PRECO: " + getPreco());
        System.out.println("ESTOQUE: " + getEstoque());
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double valor) {
        Scanner sc = new Scanner(System.in);

        while (valor < 0) {
            System.out.println("Valores negativos não são aceitos!");
            System.out.print("Informe um novo valor que seja positivo: ");
            valor = sc.nextDouble();
        }

        this.preco = valor;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

}
