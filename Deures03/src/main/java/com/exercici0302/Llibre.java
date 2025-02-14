package com.exercici0302;

public class Llibre {

    private String titol;
    private Autor autor;
    private int anyPublicacio;

    public Llibre(String titol, Autor autor, int anyPublicacio) {
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
    }

    public String getTitol() {
        return this.titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnyPublicacio() {
        return this.anyPublicacio;
    }

    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }
}
