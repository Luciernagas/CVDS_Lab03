package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.RegisterResult;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    @Test
    public void dada_edadDosAños_retorna_descuentoCincoPorciento() {
        //Arrange
        int resultado = (int) CalculadorDescuentos.calculoTarifa(50000, 6, 2);
        //Action
        int respuestaEsperada = 47500;
        //Assertion
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_edad68Años_retorna_descuentoOchoPorciento() {
        //Arrange
        int resultado = (int) CalculadorDescuentos.calculoTarifa(180000, 11, 68);
        //Action
        int respuestaEsperada = 165600;
        //Assertion
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_antelacionDe22Dias_retorna_descuentoQuincePorciento() {
        //Arrange
        int resultado = (int) CalculadorDescuentos.calculoTarifa(67000, 22, 23);
        //Action
        int respuestaEsperada = 56950;
        //Assertion
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_Edad71Años_y_antelacionde30Dias_retorna_DosDescuentos() {
        //Arrange
        int resultado = (int) CalculadorDescuentos.calculoTarifa(980000, 30, 71);
        //Action
        int respuestaEsperada = 754600;
        //Assertion
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_tarifaCero_retorna_Cero() {
        //Arrange
        int resultado = (int) CalculadorDescuentos.calculoTarifa(0, 28, 21);
        //Action
        int respuestaEsperada = 0;
        //Assertion
        Assert.assertEquals(resultado, respuestaEsperada);
    }

    @Test
    public void dada_datosSinDescuento_retorna_valorTarifa() {
        //Arrange
        int resultado = (int) CalculadorDescuentos.calculoTarifa(67000, 3, 20);
        //Action
        int respuestaEsperada = 67000;
        //Assertion
        Assert.assertEquals(resultado, respuestaEsperada);
    }
}


