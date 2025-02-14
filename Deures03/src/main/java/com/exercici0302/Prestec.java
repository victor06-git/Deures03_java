package com.exercici0302;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestec {

    private Llibre llibre;
    private String dataPrestec;
    private String dataRetorn;

    public Prestec(Llibre llibre, String dataPrestec, String dataRetorn) {
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataRetorn;
    }

    public Llibre getLlibre() {
        return this.llibre;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }

    public String getDataPrestec() {
        return this.dataPrestec;
    }

    public void setDataPrestec(String dataPrestec) {
        this.dataPrestec = dataPrestec;
    }

    public String getDataRetorn() {
        return this.dataRetorn;
    }

    public void setDataRetorn(String dataRetorn) {
        this.dataRetorn = dataRetorn;
    }

    public boolean estaEnTermini() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPrestec = LocalDate.parse(this.dataPrestec, formatter);
        LocalDate dataRetorn = LocalDate.parse(this.dataRetorn, formatter);
        LocalDate dataActual = LocalDate.now();
        return dataPrestec.isBefore(dataActual) && dataActual.isBefore(dataRetorn);
    }
}



