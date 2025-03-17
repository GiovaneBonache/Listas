package org.example;
public class ListaSimples {
    private int[] elementos;
    private int quantidade;

    public ListaSimples(int capacidade) {
        elementos = new int[capacidade];
        quantidade = 0;
    }

    public void adicionar(int elemento) {
        if (quantidade < elementos.length) {
            elementos[quantidade] = elemento;
            quantidade++;
        } else {
            System.out.println("lista Simples cheia!");
        }
    }

    public int getQuantidadeElementos() {
        return quantidade;
    }

    public int getCapacidade() {
        return elementos.length;
    }

    public void imprimir() {
        System.out.print("lista Simples: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
