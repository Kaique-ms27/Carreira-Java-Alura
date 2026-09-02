import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Kaique";
        String tipoDeConta = "Conta corrente";
        double saldo = 2500;
        boolean condition = true;

        System.out.printf("""
                ************************************
                Nome: %s
                Tipo de Conta: %s
                Saldo: %.2f
                ************************************\n
                """, nome, tipoDeConta, saldo);

        while (condition) {
            System.out.println("""
                === Menu de Opções ===
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair \n
                """);
            int escolhaMenu = sc.nextInt();
            switch (escolhaMenu) {
                case 1 :
                    System.out.printf("""
                            Saldo: %.2f \n
                            """, saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber");
                    double valorAReceber = sc.nextDouble();
                    saldo += valorAReceber;
                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;
                case 3:
                    System.out.printf("""
                            Qual o valor a ser transferido?
                            Saldo atual: %.2f \n
                            """, saldo);
                    double valorATransferir = sc.nextDouble();

                    if (valorATransferir <= saldo) {
                        saldo -= valorATransferir;
                    } else {
                        System.out.println("Saldo inválido\n");
                    }

                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    System.out.println("Opção Inválida!\n");
                    break;
            }
        }
    }
}