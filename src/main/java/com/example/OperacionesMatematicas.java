package com.example;

public class OperacionesMatematicas {

    // Método para calcular el cuadrado de un número
    public int cuadrado(int numero) {
        return numero * numero;
    }

    // Método para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular el factorial de un número
    public int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
