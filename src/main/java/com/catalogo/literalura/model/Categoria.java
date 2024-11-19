package com.catalogo.literalura.model;

public enum Categoria {
    ACCION(new String[]{"Adventure", "Action"}),
    ROMANCE(new String[]{"Romance", "Love"}),
    COMEDIA(new String[]{"Comedy", "Humor"}),
    DRAMA(new String[]{"Drama", "Tragedy"}),
    GOTHIC(new String[]{"Gothic", "Horror", "Supernatural"}),
    HISTORICA(new String[]{"Historical", "Pastoral"}),
    CIENCIA_FICCION(new String[]{"Science", "Fiction"}),
    FANTASIA(new String[]{"Fantasy", "Imaginary"}),
    TERROR(new String[]{"Horror", "Vampire", "Monster"}),
    POLITICA(new String[]{"Political", "State", "Politics"}),
    POESIA(new String[]{"Poetry", "Epic", "Dragon"}),
    FEMINISTA(new String[]{"Feminist", "Sex"}),
    DETECTIVES(new String[]{"Detective", "Mystery", "Murder"}),
    PSICOLOGIA(new String[]{"Psychological", "Identity", "Mentally"}),
    FAMILIAR(new String[]{"Family", "Sisters", "Mothers", "Daughters"}),
    RELIGION(new String[]{"Religious", "Puritans"}),
    DIDACTICA(new String[]{"Didactic", "Conduct"}),
    BIOGRAFICA(new String[]{"Autobiographical", "Biography"});

    private final String[] palabrasClave;

    Categoria(String[] palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            for (String palabraClave : categoria.palabrasClave) {
                if (text.toLowerCase().contains(palabraClave.toLowerCase())) {
                    return categoria;
                }
            }
        }
        throw new IllegalArgumentException("Ninguna categoría encontrada para el texto: " + text);
    }
}
