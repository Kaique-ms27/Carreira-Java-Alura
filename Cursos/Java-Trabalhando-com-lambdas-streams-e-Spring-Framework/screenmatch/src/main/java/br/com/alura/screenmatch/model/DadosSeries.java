package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Classe para receber os dados da API do IMDB
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("Title") String title,
                          @JsonAlias("totalSeasons") int totalSeasons,
                          @JsonAlias("imdbRating") String rating) {
}
