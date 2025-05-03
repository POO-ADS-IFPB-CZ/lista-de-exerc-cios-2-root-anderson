package view;
import model.ContaCorrente;
import model.MenuContaCorrente;

import java.util.Scanner;

public class MainContaCorrente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String titular;
        System.out.print("Informe o nome do dono dessa conta: ");
        titular = sc.nextLine();

        System.out.print("Informe o numero da sua conta: ");
        numero = sc.nextInt();

        ContaCorrente cc = new ContaCorrente(numero, titular);

        MenuContaCorrente.menuCompleto(cc);

        cc.exibirInfo();
    }
}
