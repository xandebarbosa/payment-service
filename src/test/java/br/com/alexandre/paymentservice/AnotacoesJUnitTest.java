package br.com.alexandre.paymentservice;

import org.junit.jupiter.api.*;
//Realizando o teste por ordem alfabetica usamos @TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//Realizando o teste por Ordem com @TestMethodOrder(MethodOrderer.OrderAnnotation.class), ou seja, selecionamos a order que queremos a execução do teste, colocando em cada teste o @Order()
//com o numero da ordem de execução dos testes
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//Executando o teste por ordem alfabetica do DisplayName, ou seja, segue a ordem alfabetica da primeira palavra do texto em cada teste
@TestMethodOrder(MethodOrderer.DisplayName.class)
class AnotacoesJUnitTest {

    @Test
    @DisplayName("Teste do metodo a")
    //@Order(3)
    void aMeuTeste() {
        System.out.println("Executou o teste A");
    }

    @Test
    @DisplayName("Verifica XYZ")
    //@Order(1)
    void bMeuTeste() {
        System.out.println("Executou o teste B");
    }


    @Test
    @DisplayName("Garante que YZZ")
    //@Order(2)
    void cMeuTeste() {
        System.out.println("Executou o teste C");
    }
}
