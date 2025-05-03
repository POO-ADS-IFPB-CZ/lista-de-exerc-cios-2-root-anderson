package model;

import java.util.Scanner;

public class MenuContaCorrente {
    static int opcao;
    static Scanner sc = new Scanner(System.in);

    public static void exibir() {
        System.out.println("===MENU CONTA CORRENTE===");
        System.out.println("===OPÇÕES===");
        System.out.println("1 - SACAR");
        System.out.println("2 - DEPOSITAR");
        System.out.println("3 - CONSULTAR SALDO");
        System.out.println("4 - SAIR");
        System.out.print("ESCOLHA UM OPÇÃO: ");
    }

    public static int opcoes() {
        opcao = sc.nextInt();
        return opcao;
    }

    public static void menuCompleto(ContaCorrente cc) {
        int opcao = -1;

        while (opcao != 4) {
            exibir();
            opcao = opcoes();
            int valor;
            switch (opcao) {
                case 1:
                    do {
                        System.out.println("Informe um valor para sacar");
                        valor = sc.nextInt();
                    } while (!cc.sacar(valor));
                    break;
                case 2:
                    do {
                        System.out.println("Informe um valor para depositar");
                        valor = sc.nextInt();
                    } while (!cc.depositar(valor));
                    break;
                case 3:
                    System.out.println("O saldo da conta é de: " + cc.getSaldo());
                    break;
                case 4:
                    System.out.println("\nSAINDO DO PROGRAMA.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
