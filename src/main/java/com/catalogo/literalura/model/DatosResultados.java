package com.catalogo.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosResultados(
        @JsonAlias("id") Integer id,
        @JsonAlias("title") String titulo,
        @JsonAlias("subjects") List<String> temas,
        @JsonAlias("authors") List<Autor> autores,
        @JsonAlias("languages") List<String> idiomasList,
        @JsonAlias("download_count") Integer conteoDescargas
) {
}
