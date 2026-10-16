package br.com.alexandre.paymentservice;

public final class Calculdora {

    private Calculdora() {
    }

    public static double somar(double valor1, double valor2) {
        //return  4.0; // Inicialmente definimos um valor fixo
        return valor1 + valor2; //Refatorando e aplicando corretamente a logica
    }


    public static double subtrair(double valor1, double valor2) {
        //return 2.0; // Inicialmente definimos um valor fixo
        return valor1 - valor2; //Refatorando e aplicando corretamente a logica
    }

    public static double multiplicar(double valor1, double valor2) {
        //return 10.0;
        return valor1 * valor2;
    }

    public static double dividir(double valor1, double valor2) {
        //return 5.0;
        return valor1 / valor2;
    }
}
