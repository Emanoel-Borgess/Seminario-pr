package com.workshop;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class RelatorioUtil {

    public static String GERAR_RELATORIO(List<String> linhas) {
        String resultado = "";
        for (int i = 0; i < linhas.size(); i++) {
            resultado = resultado + linhas.get(i) + "\n";
        }
        return resultado;
    }

    public static boolean temErro(String linha) {
        if (linha.indexOf("ERRO") != -1) return true; else return false;
    }

    public static int contarErros(List<String> linhas) {
        int c = 0;
        for (int i = 0; i < linhas.size(); i++) {
            String l = linhas.get(i);
            if (temErro(l) == true) {
                c++;
            }
        }
        return c;
    }
}
