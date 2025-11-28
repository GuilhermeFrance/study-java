import java.util.*;
import OOP.entities.NovaConta;

public class ExercisioTransacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int numeroAcc;
        char answer;

        System.out.println("Olá, gostaria de cadastrar uma conta no HuskBank? (s/n)");
        answer = sc.next().charAt(0);
        if (answer == 's') {
            System.out.println("Digite o seu nome completo: ");
            nome = sc.next();
            System.out.println("Digite um número para sua conta numéro da conta:");
            numeroAcc = sc.nextInt();
            System.out.println("Deseja realizar um depósito inicial? (s/n)");
            answer = sc.next().charAt(0);
            if (answer == 's') {
                System.out.println("Digite o valor do depósito: ");
                double DepositoInicial;
                DepositoInicial = sc.nextDouble();
                System.out.printf("%.2fn depositado", DepositoInicial);
                NovaConta conta1 = new NovaConta(nome, numeroAcc, DepositoInicial);
                System.out.println("Conta criada com sucesso!");
                conta1.mostrar();

            } else {
                NovaConta conta1 = new NovaConta(nome, numeroAcc);
                System.out.println("Conta criada com sucesso!");
                conta1.mostrar();
                System.out.println("Gostaria de fazer algum depósito? (s/n");
                answer = sc.next().charAt(0);
                if (answer == 's') {
                    double DepositoInicial;
                    System.out.println("Digite o valor a ser depositado: ");
                    DepositoInicial = sc.nextDouble();
                    conta1.depositar(DepositoInicial);
                    System.out.printf("%.2fn depositado", DepositoInicial);
                    conta1.mostrar();
                }
                System.out.println("Gostaria de fazer algum saque? (s/n");
                answer = sc.next().charAt(0);
                if (answer == 's') {
                    double valorSaque;
                    System.out.print("Digite o valor para sacar: ");
                    valorSaque = sc.nextDouble();
                    conta1.sacar(valorSaque);
                    System.out.println("Novo saldo: ");
                    conta1.mostrar();
                }
            }

            sc.close();

        }

    }
}
