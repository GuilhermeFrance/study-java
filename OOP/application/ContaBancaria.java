public class ContaBancaria {
    // --- Atributos ---
    int numero;
    String titular;
    double saldo;
    // --- Construtor ---
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    // --- Métodos ---
    public void depositarValor(double valor) {
        if (valor > 0) {
            this.saldo += valor; // Adiciona o valor ao saldo
            System.out.println("Depósito: " + String.format("R$ %.2f", valor));
        } else {
            System.out.println("Erro: O valor deve ser positivo.");
        }
    }

    public void sacarValor(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor deve ser positivo.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor; // Subtrai o valor do saldo
            System.out.println("Saque de " + String.format("R$ %.2f", valor));
        } else {
            System.out.println("Saldo insuficiente para " + this.titular + ". Tentativa de saque: " + String.format("R$ %.2f", valor));
        }
    }

       public void exibirInformacoes() {
        System.out.println("-------------------------");
        System.out.println("Titular da Conta: " + this.titular);
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo Atual: " + String.format("R$ %.2f", this.saldo));
        System.out.println("-------------------------");
    }

      public static void main(String[] args) {
       
        // Instanciando 2 objetos da classe ContaBancaria
        ContaBancaria conta1 = new ContaBancaria(101, "Ana Silva", 2500.75);
        ContaBancaria conta2 = new ContaBancaria(102, "João Santos", 150.50);

        System.out.println(">>> Estado Inicial das Contas <<<");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();

        System.out.println("\n>>> Realizando Operações <<<");

        // Operações na conta 1 (Ana Silva)
        conta1.depositarValor(500.00);
        conta1.sacarValor(1000.00);  
        conta1.depositarValor(-100);

        // Operações na conta 2 (João Santos)
        conta2.sacarValor(100.00);
        conta2.sacarValor(200.00);    

        System.out.println("\n>>> Estado Final das Contas <<<");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
    }
}