public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0; 
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", "Pedro Souza");

        conta.depositar(500.0);
        conta.sacar(150.0);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(1000.0);
    }
}
