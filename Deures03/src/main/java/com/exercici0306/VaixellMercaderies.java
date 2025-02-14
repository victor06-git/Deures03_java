package com.exercici0306;

public class VaixellMercaderies extends Vaixell implements Reglamentari {

    private String paisRegistre;

    public VaixellMercaderies(String nom, double capacitat, String paisRegistre) {
        super(nom, capacitat);
        this.paisRegistre = paisRegistre;
    }

    public String getPaisRegistre() {
        return this.paisRegistre;
    }

    public void setPaisRegistre(String value) {
        this.paisRegistre = value;
    }

    @Override
    public boolean compleixNormativa() {
        return this.getPesTotal() <= this.capacitat;
    }

    @Override
    public String toString() {
        return "VaixellMercaderies[nom=" + nom + ", capacitat=" + capacitat + ", pesActual=" + getPesTotal() + ", paisRegistre=" + paisRegistre + "]";
    }
}
