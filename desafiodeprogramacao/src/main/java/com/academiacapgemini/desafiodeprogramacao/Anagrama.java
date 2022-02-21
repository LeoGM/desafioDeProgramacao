package com.academiacapgemini.desafiodeprogramacao;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrama {

    private HashMap<String, Integer> mapa = new HashMap<>();
    private int contadorPares, n;
    private char[] arrChar;
    private String valor;
    
    public void verificarPalavra(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                arrChar = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(arrChar);
                valor = new String(arrChar);
                if (mapa.containsKey(valor)) {
                    mapa.put(valor, mapa.get(valor) + 1);
                } else {
                    mapa.put(valor, 1);
                }
            }
        }
        for (String key : mapa.keySet()) {
            n = mapa.get(key);
            contadorPares += (n * (n - 1)) / 2;
        }
        System.out.println("Existem " + contadorPares + " anagramas pares nesta palavra.");
    }
}
