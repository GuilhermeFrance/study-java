package OOP.entities;

public class NovaConta {
    private String nome;
    private int numeroConta;
    private double saldoInicial;


    public NovaConta(String nome, int numeroConta, double primeiroDepoisto){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoInicial = primeiroDepoisto;
    }
    public NovaConta(String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
        
    }

    public String setNome(String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    public Double depositar(double valorDeposito){
        this.saldoInicial = saldoInicial + valorDeposito;
        return this.saldoInicial;
    }

    public Double sacar(double valorSaque){
        this.saldoInicial = (saldoInicial - valorSaque) - 5;
        return saldoInicial;
    }

    public void mostrar(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Número da Conta: "+ this.numeroConta);
        System.out.println("Saldo: R$"+ this.saldoInicial);
    }

}
