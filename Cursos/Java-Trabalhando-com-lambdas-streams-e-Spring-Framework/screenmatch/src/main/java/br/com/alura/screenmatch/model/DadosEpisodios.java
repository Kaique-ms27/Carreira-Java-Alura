package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("Title") String title,
                             @JsonAlias("Episode") int episode,
                             @JsonAlias("imdbRating") String rating,
                             @JsonAlias("Released") String released) {
}
