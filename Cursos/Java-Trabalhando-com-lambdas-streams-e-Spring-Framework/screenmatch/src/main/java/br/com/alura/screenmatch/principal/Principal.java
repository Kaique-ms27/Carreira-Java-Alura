package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosSeries;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private final Scanner sc = new Scanner(System.in);
    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4e39c79e";
    private final ConsumoAPI consumoAPI = new ConsumoAPI();
    private final ConverteDados conversor = new ConverteDados();

    public void exibeMenu() {
        System.out.println("Digite o nome da série para busca:");
        var nomeSerie = sc.nextLine();
        String busca = ENDERECO + nomeSerie.replace(" ", "+") + API_KEY;
        var json = consumoAPI.obterDados(busca);
        DadosSeries dadosSeries = conversor.obterDados(json, DadosSeries.class);
        System.out.println(dadosSeries);

        List<DadosTemporada> temporadas = new ArrayList<>();

        // Convertendo os dados para a classe DadosTemporadas
        for (int i = 1; i <= dadosSeries.totalSeasons(); i++) {
            String endercoTemporadads = STR."\{ENDERECO}\{nomeSerie.replace(" ", "+")}&season=\{i}\{API_KEY}";
            json = consumoAPI.obterDados(endercoTemporadads);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);

//        for (int i = 0; i< dadosSeries.totalSeasons() ; i++) {
//            List<DadosEpisodios> episodiosTemporada = temporadas.get(i).episodes();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).title());
//            }
//        }

        temporadas.forEach(t -> t.episodes().forEach(e -> System.out.println(e.title())));
    }

}
