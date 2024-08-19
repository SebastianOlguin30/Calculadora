package com.example;

public class Calculadora {

    // Método para verificar si el número es válido (no es NaN o Infinity)
    private void validarNumero(double numero) {
        if (Double.isNaN(numero)) {
            throw new IllegalArgumentException("El valor proporcionado no es un número válido.");
        }
        if (Double.isInfinite(numero)) {
            throw new IllegalArgumentException("El valor proporcionado es infinito, lo cual no es permitido.");
        }
    }

    public double sumar(double a, double b) {
        validarNumero(a);
        validarNumero(b);
        return a + b;
    }

    public double restar(double a, double b) {
        validarNumero(a);
        validarNumero(b);
        return a - b;
    }

    public double multiplicar(double a, double b) {
        validarNumero(a);
        validarNumero(b);
        return a * b;
    }

    public double dividir(double a, double b) {
        validarNumero(a);
        validarNumero(b);
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}