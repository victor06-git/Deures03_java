package com.exercici0302;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestec {

    public Prestec(Llibre llibre, String dataPrestec, String dataRetorn) {
    }

    public Llibre getLlibre() {
        Llibre rst = new Llibre("", new Autor("", ""), 0);
        return rst;
    }

    public void setLlibre(Llibre llibre) {
    }

    public String getDataPrestec() {
        return "";
    }

    public void setDataPrestec(String dataPrestec) {
    }

    public String getDataRetorn() {
        return "";
    }

    public void setDataRetorn(String dataRetorn) {
    }

    public boolean estaEnTermini() {
        return false;
    }
}



