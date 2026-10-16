package br.com.alexandre.paymentservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void somar() {

        //arrange
        double valor1 = 2;
        double valor2 = 2;

        //act
        var resultado = Calculdora.somar(valor1, valor2);

        //assert
        Assertions.assertEquals(4.0, resultado);
    }

    @Test
    void subtrair() {

        //arrange
        double valor1 = 10;
        double valor2 = 5;

        //act
        var resultado = Calculdora.subtrair(valor1, valor2);

        //assert
        Assertions.assertEquals(5.0, resultado);
    }

    @Test
    void multiplicacao() {

        //arrange
        double valor1 = 5;
        double valor2 = 2;

        //act
        var resultado = Calculdora.multiplicar(valor1, valor2);

        //assert
        Assertions.assertEquals(10.0, resultado);
    }

    @Test
    void dividisao() {

        //arrange
        double valor1 = 10;
        double valor2 = 2;

        //act
        var resultado = Calculdora.dividir(valor1, valor2);

        //assert
        Assertions.assertEquals(5.0, resultado);
    }

    @Test
    void divisaoDoisValoresZeroResultandoEmNaN() {

        //NaN - Em Java, NaN significa "Not a Number" (Não é um Número)
        //arrange
        double valor1 = 0;
        double valor2 = 0;

        //act
        var resultado = Calculdora.dividir(valor1, valor2);

        //assert
        Assertions.assertEquals(Double.NaN, resultado);
    }

    @Test
    void divisaoPorZeroResultandoEmPositivoInfinito() {
        //arrange
        double valor1 = 10;
        double valor2 = 0;

        //act
        var resultado = Calculdora.dividir(valor1, valor2);

        //assert
        Assertions.assertEquals(Double.POSITIVE_INFINITY, resultado);
    }

    //Fazer soma, subtração e multiplicação com valores negativos
}
