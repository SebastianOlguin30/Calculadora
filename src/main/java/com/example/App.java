package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación (+, -, *, /):");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;
        switch (operacion) {
            case '+':
                resultado = calculadora.sumar(num1, num2);
                break;
            case '-':
                resultado = calculadora.restar(num1, num2);
                break;
            case '*':
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case '/':
                try {
                    resultado = calculadora.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}