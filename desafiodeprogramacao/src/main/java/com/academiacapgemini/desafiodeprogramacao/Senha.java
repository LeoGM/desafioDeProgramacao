package com.academiacapgemini.desafiodeprogramacao;

import java.util.*;

public class Senha {

    private boolean temMinuscula = false, temMaiuscula = false, temNumero = false,
            temCaractereEspecial = false, tem6Digitos = false, valid = false;

    private Set<Character> listaCaracteresEspeciais = new HashSet<>(
            Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

    public boolean validarForcaSenha(String senhaAValidar) {
        verificarForcaSenha(senhaAValidar);
        return valid;
    }

    private void verificarForcaSenha(String senhaAValidar) {

        for (char i : senhaAValidar.toCharArray()) {
            if (Character.isLowerCase(i)) {
                temMinuscula = true;
            }
            if (Character.isUpperCase(i)) {
                temMaiuscula = true;
            }
            if (Character.isDigit(i)) {
                temNumero = true;
            }
            if (listaCaracteresEspeciais.contains(i)) {
                temCaractereEspecial = true;
            }
        }
        tem6Digitos = (6 <= senhaAValidar.length()) ? true : false;

        if (!tem6Digitos) {
            System.out.println("Senha deve conter 6 caractéres, escreva mais " 
                    + (6 - senhaAValidar.length()));
        }
        if (!temMinuscula) {
            System.out.println("Senha deve conter uma letra minúscula.");
        }
        if (!temMaiuscula) {
            System.out.println("Senha deve conter uma letra maiúscula.");
        }
        if (!temNumero) {
            System.out.println("Senha deve conter um número.");
        }
        if (!temCaractereEspecial) {
            System.out.println("Senha deve um caractér especial");
        }

        valid = (tem6Digitos && temMinuscula && temMaiuscula 
                && temNumero && temCaractereEspecial) ? true : false;
    }
}
