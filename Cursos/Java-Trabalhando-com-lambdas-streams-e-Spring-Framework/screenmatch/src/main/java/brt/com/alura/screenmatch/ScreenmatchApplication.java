package brt.com.alura.screenmatch;

import brt.com.alura.screenmatch.model.DadosEpisodios;
import brt.com.alura.screenmatch.model.DadosSeries;
import brt.com.alura.screenmatch.service.ConsumoAPI;
import brt.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConverteDados conversor = new ConverteDados();

		// Endereço da API do IMDB
		String enderecoSerie = "http://www.omdbapi.com/?t=Suits&apikey=4e39c79e";
		var consumoAPI = new ConsumoAPI();

		// Consumindo os dados da API
		var json = consumoAPI.obterDados(enderecoSerie);

		// Converte os dados do json para apenas os dados da classe DadosSeries
		DadosSeries dadosSeries = conversor.obterDados(json, DadosSeries.class);
		// Exibir os dados
		System.out.println(dadosSeries);


		// Convertendo os dados para a classe DadosEpisodios
		String enderecoEpisodio = "http://www.omdbapi.com/?t=suits&season=1&episode=1&apikey=4e39c79e";
		json = consumoAPI.obterDados(enderecoEpisodio);
		DadosEpisodios dadosEpisodios = conversor.obterDados(json, DadosEpisodios.class);
		System.out.println(dadosEpisodios);
	}
}
