package com.exercici0305;

public class Participant {
    protected String nom;
    protected int edat;

    public Participant(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public int getEdat() {
        return this.edat;
    }

    public void setEdat(int value) {
        this.edat = value;
    }

    @Override
    public String toString() {
        return "Partcipant[nom=" + this.nom + ", edat=" + edat + "]";
    }
}
