package com.academiacapgemini.desafiodeprogramacao;

public class Escada {

    public void escreverEscada(int tamanhoDaEscada) {
        for (int linha = 1; linha <= tamanhoDaEscada; linha++) {
            for (int coluna = 1; coluna <= tamanhoDaEscada; coluna++) {
                System.out.print(coluna <= (tamanhoDaEscada - linha) ? " " : "*");
            }
            System.out.println();
        }
    }
    
    public void validarEntrada(String entrada) {
        if (entrada.matches("[+-]?\\d*(\\.\\d+)?")) {
            escreverEscada(Integer. parseInt(entrada));
        } else {
            System.out.print("Não é um número!");
        }
    }    
}
