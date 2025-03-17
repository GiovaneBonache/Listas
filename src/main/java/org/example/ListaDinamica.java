package org.example;


public class ListaDinamica {
    private No primeiro;
    private int quantidade;

    public ListaDinamica() {
        primeiro = null;
        quantidade = 0;
    }

    public void adicionar(int elemento) {
        No novoNo = new No(elemento);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        quantidade++;
    }

    public int getQuantidadeElementos() {
        return quantidade;
    }

    public void imprimir() {
        System.out.print("lista dinâmica:");
        No atual = primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

