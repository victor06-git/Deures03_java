package com.exercici0300;

public class Main {
    public static void main(String[] args) {

        // Intenta superar la capacitat màxima
        for (int i = 1; i <= 6; i++) {
            String nom = "Estudiant" + i;
            String id = "ID" + i;
            new Estudiant(nom, id);
            System.out.println("Intent registrant: " + nom + ". Total registrats: " + Estudiant.getComptadorEstudiants());
        }

        // Comprova si encara hi ha capacitat després dels intents de registre
        if (Estudiant.hiHaCapacitat()) {
            System.out.println("Encara hi ha capacitat per a més estudiants.");
        } else {
            System.out.println("No hi ha més capacitat per a registrar estudiants.");
        }     
    }
}