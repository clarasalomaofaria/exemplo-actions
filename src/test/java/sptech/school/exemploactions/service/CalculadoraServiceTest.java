package sptech.school.exemploactions.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 2 deve retornar 5")
    public void testDividir() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double resultado = calculadoraService.dividir(10, 2);
        assertEquals(5, resultado);
    }


}