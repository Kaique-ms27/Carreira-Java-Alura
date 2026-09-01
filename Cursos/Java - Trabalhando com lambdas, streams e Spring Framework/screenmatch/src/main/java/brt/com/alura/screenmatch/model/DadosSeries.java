package brt.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSeries(@JsonAlias("Title") String title,
                          @JsonAlias("totalSeasons") int totalSeasons,
                          @JsonAlias("imdbRating") String rating) {
}
