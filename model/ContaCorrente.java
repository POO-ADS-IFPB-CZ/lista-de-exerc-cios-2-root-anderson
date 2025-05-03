package model;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.setSaldo(0);
        this.setNumero(numero);
        this.setTitular(titular);
    }

    public void exibirInfo() {
        System.out.println("NUMERO DA CONTA: " + getNumero());
        System.out.println("NOME DO TITULAR: " + getTitular());
        System.out.println("SALDO DA CONTA: " + getSaldo());
    }

    public boolean sacar(float valor) {
        if(getSaldo() == 0) {
            System.out.println("Antes de sacar deposite alguma quantia.");
            return true;
        }
        if(valor > getSaldo()) {
            System.out.println("Operação inválida pois o valor a sacar é maior que o saldo.");
            return false;
        }
        if(valor > 10000) {
            System.out.println("Não é possível sacar valores maiores que R$ 10000.");
            return false;
        }
        if(valor <= 0) {
            System.out.println("Não é possível sacar valores iguais ou menores que R$ 0.");
            return false;
        }

        setSaldo(getSaldo() - valor);
        System.out.println("R$ "+ valor + "sacado com sucesso. Novo saldo é de: R$" + getSaldo());
        return true;
    }

    public boolean depositar(float valor) {
        if(valor <= 0) {
            System.out.println("Não é possível depositar valores iguais ou menores que R$ 0.");
            return false;
        } else if (valor > 10000) {
            System.out.println("Não é possível depositar valores maiores que R$ 10000.");
        }

        setSaldo(getSaldo() + valor);
        System.out.println("R$ "+ valor + " depositados com sucesso. Novo saldo é de: R$" + getSaldo());

        return true;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

}
