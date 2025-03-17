package org.example;

public class TesteListas {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        listaSimples.adicionar(10);
        listaSimples.adicionar(20);
        listaSimples.adicionar(30);
        listaSimples.imprimir();
        System.out.println("lista simples quantidade de elementos: " + listaSimples.getQuantidadeElementos());
        System.out.println("lista simples capacidade: " + listaSimples.getCapacidade());
        System.out.println();
        ListaDinamica lista = new ListaDinamica();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.imprimir();
        System.out.println("quantidade de elementos: " + lista.getQuantidadeElementos());
    }
}
