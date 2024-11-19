package com.catalogo.literalura.model;



import java.util.List;


public class Libro {
    private Integer id;
    private String titulo;
    private Categoria temas;
    private List<Autor> autores;
    private List<String> idiomasList;
    private Integer conteoDescargas;

    public Libro(DatosResultados datosResultados){
        this.id= datosResultados.id();
        this.titulo= datosResultados.titulo();
        this.temas = datosResultados.temas()
                .stream()
                .map(Categoria::fromString)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No se encontró ninguna categoría"));
        this.autores= datosResultados.autores();
        this.idiomasList= datosResultados.idiomasList();
        this.conteoDescargas= datosResultados.conteoDescargas();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getTemas() {
        return temas;
    }

    public void setTemas(Categoria temas) {
        this.temas = temas;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomasList() {
        return idiomasList;
    }

    public void setIdiomasList(List<String> idiomasList) {
        this.idiomasList = idiomasList;
    }

    public Integer getConteoDescargas() {
        return conteoDescargas;
    }

    public void setConteoDescargas(Integer conteoDescargas) {
        this.conteoDescargas = conteoDescargas;
    }
}
