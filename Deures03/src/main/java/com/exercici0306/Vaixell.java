package com.exercici0306;

import java.util.ArrayList;

public class Vaixell implements Transportable {

    protected String nom;
    protected double capacitat;
    protected ArrayList<Carrega> carregues;

    public Vaixell(String nom, double capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.carregues = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public double getCapacitat() {
        return this.capacitat;
    }
   
    public void setCapacitat(double value) {
        this.capacitat = value;
    }

    public void afegirCarrega(Carrega c) {
        this.carregues.add(c);
    }

    public ArrayList<Carrega> getCarregues() {
        return carregues;
    }

    @Override
    public double getPesTotal() {
        return carregues.stream().mapToDouble(Carrega::getPes).sum(); // This is the same as: double sum = 0; for (Carrega c : carregues) sum += c.getPes(); return sum;
    }

    @Override
    public String toString() {
        return "Vaixell[nom=" + nom + ", capacitat=" + capacitat + ", pesActual=" + getPesTotal() + "]";
    }
}
