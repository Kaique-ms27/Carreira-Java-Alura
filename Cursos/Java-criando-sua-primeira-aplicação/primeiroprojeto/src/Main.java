public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Sreen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano do Lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        // Media calculada pelas três notas passadas no curso do Alura
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse = """
                Filme Top Gun
                Filme de aventura com Tom Cruise.
                Ano de Lançamento: %d
                """.formatted(anoDeLancamento)
        ;
        System.out.println(sinopse);
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}