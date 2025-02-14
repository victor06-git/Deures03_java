package com.exercici0306;

public class CarregaPerillosa extends Carrega {

    private int nivellPerillositat; //Entre 0 i 5

    public CarregaPerillosa(String descripcio, double pes, int nivellPerillositat) {
        super(descripcio, pes);
        if (nivellPerillositat < 0 || nivellPerillositat > 5) {
            throw new IllegalArgumentException("El nivell de perillositat ha de ser entre 0 i 5");
        }
        this.nivellPerillositat = nivellPerillositat;
    }

    public int getNivellPerillositat() {
        return this.nivellPerillositat;
    }

    public void setNivellPerillositat(int value) {
        if (nivellPerillositat < 0 || nivellPerillositat > 5) {
            throw new IllegalArgumentException("El nivell de perillositat ha de ser entre 0 i 5");
        } else {
            this.nivellPerillositat = value;
        }
    }

    @Override
    public String toString() {
        return "CarregaPerillosa[descripcio=" + descripcio + ", pes=" + pes + ", nivellPerillositat=" + nivellPerillositat + "]";
    }
}
