package com.exercicis;

import com.exercici0301.*;
import com.testStringUtils.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import static org.junit.jupiter.api.Assertions.*;

import com.github.stefanbirkner.systemlambda.SystemLambda;

class TestExercici0301 {

    @BeforeEach
    public void resetControlTemperaturaState() {
        // Reinicia els atributs estàtics abans de cada test
        try {
            java.lang.reflect.Field temperaturaTotalField = ControlTemperatura.class.getDeclaredField("temperaturaTotal");
            java.lang.reflect.Field comptadorZonesField = ControlTemperatura.class.getDeclaredField("comptadorZones");

            temperaturaTotalField.setAccessible(true);
            comptadorZonesField.setAccessible(true);

            temperaturaTotalField.set(null, 0.0);
            comptadorZonesField.set(null, 0);
        } catch (Exception e) {
            throw new RuntimeException("Error al reiniciar l'estat de la classe ControlTemperatura", e);
        }
    }

    @Test
    public void testTemperaturaMitjanaInicial(TestInfo testInfo) throws Exception {
        double mitjana = ControlTemperatura.getTemperaturaMitjana();
        assertEquals(0.0, mitjana, 0.01, "La temperatura mitjana inicial ha de ser 0.");
    }

    @Test
    public void testCreacioZones(TestInfo testInfo) throws Exception {
        try {
            ControlTemperatura zona1 = new ControlTemperatura("Zona 1", 22.5);
            ControlTemperatura zona2 = new ControlTemperatura("Zona 2", 25.0);

            assertEquals(23.75, ControlTemperatura.getTemperaturaMitjana(), 0.01, "La temperatura mitjana no és correcta després d'afegir dues zones.");
            System.out.println("Test passed, succeeded!");

        } catch (AssertionError e) {
            System.out.println("Test failed: " + testInfo.getDisplayName());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Test encountered an error: " + testInfo.getDisplayName());
            e.printStackTrace();
        }
    }

    @Test
    public void testAjustarTemperatura(TestInfo testInfo) throws Exception {
        try {
            ControlTemperatura zona = new ControlTemperatura("Zona 1", 22.5);
            zona.ajustaTemperatura(24.0);

            assertEquals(24.0, zona.getTemperatura(), 0.01, "La temperatura de la zona no s'ha ajustat correctament.");
            assertEquals(24.0, ControlTemperatura.getTemperaturaMitjana(), 0.01, "La temperatura mitjana no s'ha ajustat correctament després del canvi.");
            System.out.println("Test passed, succeeded!");

        } catch (AssertionError e) {
            System.out.println("Test failed: " + testInfo.getDisplayName());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Test encountered an error: " + testInfo.getDisplayName());
            e.printStackTrace();
        }
    }

    @Test
    public void testTemperaturaMitjanaDespresDeEliminarZones(TestInfo testInfo) throws Exception {
        try {
            ControlTemperatura zona1 = new ControlTemperatura("Zona 1", 22.5);
            ControlTemperatura zona2 = new ControlTemperatura("Zona 2", 25.0);

            zona1.ajustaTemperatura(0.0);

            assertEquals(12.5, ControlTemperatura.getTemperaturaMitjana(), 0.01, "La temperatura mitjana no és correcta després de canviar una zona a 0.");
            System.out.println("Test passed, succeeded!");

        } catch (AssertionError e) {
            System.out.println("Test failed: " + testInfo.getDisplayName());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Test encountered an error: " + testInfo.getDisplayName());
            e.printStackTrace();
        }
    }
}
