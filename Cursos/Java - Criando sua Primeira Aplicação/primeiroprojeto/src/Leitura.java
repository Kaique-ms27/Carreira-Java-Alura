import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favoriro: ");
        String filmeFavorito = sc.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = sc.nextInt();

        System.out.println("Digite a sua nota para o filme: ");
        double avaliacao = sc.nextDouble();

        System.out.println("Nome do Filme: " + filmeFavorito);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota: " + avaliacao);
    }
}
