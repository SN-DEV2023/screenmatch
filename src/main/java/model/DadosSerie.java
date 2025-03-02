package model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias ("Runtime") String duracao,
                          @JsonAlias ("imdbRating") String avaliacao)   {

}
