package brt.com.alura.screenmatch;

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
		String endereco = "http://www.omdbapi.com/?t=Suits&apikey=4e39c79e";
		var consumoAPI = new ConsumoAPI();

		// Consumindo os dados da API
		var json = consumoAPI.obterDados(endereco);

		// Converte os dados do json para apenas os dados da classe converteDados
		DadosSeries dados = conversor.obterDados(json, DadosSeries.class);
		// Exibir os dados
		System.out.println(dados);
	}
}
