package com.workshop;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;

public class Calculadora {

    public int X;

    public int soma(int a, int b) {
        return a + b;
    }

    public double CalcularDesconto(double preco) {
        if (preco > 100) return preco * 0.9;
        else return preco;
    }

    public double calcularImposto(double valor) {
        double resultado = valor * 0.27;
        return resultado;
    }

    public int fatorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) r = r * i;
        return r;
    }
}
