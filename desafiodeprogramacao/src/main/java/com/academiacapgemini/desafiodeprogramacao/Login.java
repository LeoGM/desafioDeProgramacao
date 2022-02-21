package com.academiacapgemini.desafiodeprogramacao;

import java.util.Scanner;

public class Login {

    Scanner entrada = new Scanner(System.in);
    String nome = "";
    String senha = "";

    public void iniciarPrograma() {
        if (nome.isEmpty() && senha.isEmpty()) {
            Senha validador = new Senha();
            boolean validou = true;
            System.out.println("Para iniciar o app entre com seu nome: ");
            nome = entrada.next();
            do {
                System.out.println("digite sua senha: ");
                senha = entrada.next();
            } while (validou = !validador.validarForcaSenha(senha));
            if (!validou) {
                System.out.println("Para ver uma escada de tamanho n digite 1, "
                        + "\n para ver quantos pares de anagramas tem uma palavra digite 2, "
                        + "\n e digite outro caractere para sair para sair.");
                escolherFuncao(entrada.next());
            }
        }
    }

    private void escolherFuncao(String opcoes) {
        switch (opcoes) {

            case "1" -> {
                System.out.println("Qual é o tamanho da escada? Digite um número:");
                Escada novaEscada = new Escada();
                novaEscada.validarEntrada(entrada.next());
            }

            case "2" -> {
                System.out.println("Qual é a palavra que quer verificar?");
                Anagrama novoAnagrama = new Anagrama();
                novoAnagrama.verificarPalavra(entrada.next());
            }

            default ->
                System.out.println("Fechando app!");
        }
    }
}