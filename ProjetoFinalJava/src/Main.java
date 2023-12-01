import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Leonardo Buracof";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;


        System.out.println("**********************************");
        System.out.println("\nCliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************************");

        String menu = """
                - Digite a sua opção -
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Sacar valor
                4 - Receber valor
                5 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a tranferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja sacar?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar o saque.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Qual valor deseja receber?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 5) {
                System.out.println("Opção inválida.");
            }
            if (opcao == 5){
                System.out.println("Obrigado por usar os nossos serviços!");
            }
        }
    }
}

                



