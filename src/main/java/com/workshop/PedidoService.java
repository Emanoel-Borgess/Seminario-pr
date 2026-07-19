package com.workshop;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class PedidoService {

    public double processarpedido(List<Double> itens, String cliente, boolean vip, String cupom) {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total = total + itens.get(i);
        }
        if (vip == true) {
            total = total * 0.85;
        }
        if (cupom != null) {
            if (cupom.equals("DESC10")) {
                total = total * 0.9;
            }
            if (cupom.equals("DESC20")) {
                total = total * 0.8;
            }
            if (cupom.equals("FRETEGRATIS")) {
                total = total - 15.99;
            }
        }
        if (total > 500) {
            total = total * 0.95;
        }
        if (total < 0) total = 0;
        System.out.println("Pedido do cliente " + cliente + " processado com total: " + total);
        return total;
    }

    public void ImprimirNota(String cliente, double total) {
        System.out.println("=====================");
        System.out.println("NOTA FISCAL");
        System.out.println("Cliente: " + cliente);
        System.out.println("Total: " + total);
        System.out.println("=====================");
    }
}
