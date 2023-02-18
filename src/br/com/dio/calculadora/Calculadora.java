package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        int divisao = divisao(a, b);

        System.out.println("\n O valor da soma é : " + soma);
        System.out.println("\n O valor da subtração é : " + subtracao);
        System.out.println("\n O valor da multiplicação é : " + multiplicacao);
        System.out.println("\n O valor da divisão é : " + divisao);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;

    }

}
