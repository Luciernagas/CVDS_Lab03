package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.RegisterResult;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    @Test
    public void dada_edadCero_retorna_Error() {
        try {
            CalculadorDescuentos.calculoTarifa(5000000, 15, 0);
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void dada_edadMenorACero_retorna_Error() {
        try {
            CalculadorDescuentos.calculoTarifa(5000000, 15, -8);
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void dada_edadDosAños_retorna_descuentoCincoPorciento() {
        int resultado = (int) CalculadorDescuentos.calculoTarifa(50000, 6, 2);
        int respuestaEsperada = 47500;
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_edad68Años_retorna_descuentoOchoPorciento() {
        int resultado = (int) CalculadorDescuentos.calculoTarifa(180000, 11, 68);
        int respuestaEsperada = 165600;
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_antelacionDe22Dias_retorna_descuentoQuincePorciento() {
        int resultado = (int) CalculadorDescuentos.calculoTarifa(67000, 22, 23);
        int respuestaEsperada = 56950;
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_Edad71Años_y_antelacionde30Dias_retorna_DosDescuentos() {
        int resultado = (int) CalculadorDescuentos.calculoTarifa(980000, 30, 71);
        int respuestaEsperada = 754600;
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_tarifaCero_retorna_Cero() {
        int resultado = (int) CalculadorDescuentos.calculoTarifa(0, 28, 21);
        int respuestaEsperada = 0;
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_datosSinDescuento_retorna_valorTarifa() {
        int resultado = (int) CalculadorDescuentos.calculoTarifa(67000, 3, 20);
        int respuestaEsperada = 67000;
        Assert.assertEquals(resultado, respuestaEsperada);
    }
}


