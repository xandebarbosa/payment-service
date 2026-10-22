package br.com.alexandre.paymentservice;

import org.junit.jupiter.api.*;

class AnotacoesJUnitTest {

    //@BeforeAll e @AfterAll são sempre metodos staticos
    @BeforeAll
    static void preCondicaoPorTodosOsTestes() {
        // usado para inicializações de recursos. Ex: kafka, banco, docker, etc...
        System.out.println("Executou a pre-condição antes de todos os testes");
    }

    @AfterAll
    static void postCondicaoPorTodosOsTestes() {
        // usado para finalização de recursos. Ex: kafka, banco, docker, etc...
        System.out.println("Executou a pos-condição depois de todos os testes");
    }

    @BeforeEach
    void preCondicaoPorTeste() {
        // usado para inicialização de recursos por teste. Ex: inserir algum dado especifico no banco
        System.out.println("Executou a precondição por teste..");
    }

    @AfterEach
    void posCondicaoPorTeste() {
        // usado para remover alguns recursos especificos por teste. Ex: remover todos os dados do banco
        System.out.println("Executou a pos-condição por teste....");
    }

    @Test
    void aMeuTeste() {
        System.out.println("Executou o teste A");
    }

    @Test
    void bMeuTeste() {
        System.out.println("Executou o teste B");
    }


    @Test
    void cMeuTeste() {
        System.out.println("Executou o teste C");
    }
}
