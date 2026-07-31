package com.workshop;

import java.util.List;

public class RelatorioUtil {

    private static final int INDICE_NAO_ENCONTRADO = -1;

    public static String gerarRelatorio(List<String> linhas) {
        String resultado = "";
        for (int i = 0; i < linhas.size(); i++) {
            resultado = resultado + linhas.get(i) + "\n";
        }
        return resultado;
    }

    public static boolean temErro(String linha) {
        return linha.indexOf("ERRO") != INDICE_NAO_ENCONTRADO;
    }

    public static int contarErros(List<String> linhas) {
        int contador = 0;
        for (int i = 0; i < linhas.size(); i++) {
            String linhaAtual = linhas.get(i);
            if (temErro(linhaAtual)) {
                contador++;
            }
        }
        return contador;
    }
}