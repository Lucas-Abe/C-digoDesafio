package projetotarget;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ProjetoTarget {

    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercício 1*/
 /*
        System.out.println("Insire um numero:");
        int numeroEscolhido = input.nextInt();
        int check = 1;

        if (numeroEscolhido < 0) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            System.exit(-1);
        } 
        else {
            for (int i = 0; ; i++) {
                int contagem = fibonacci(i);

                if (contagem == numeroEscolhido) {
                    check = 0;
                    break;
                } 
                else if (contagem > numeroEscolhido) {
                    check = -1;
                    break;
                }

            }

        }

        if (check == 0) {
            System.out.println("O numero " + numeroEscolhido + " esta presente na sequencia de Fibonacci!");
        } 
        else {
            System.out.println("O numero " + numeroEscolhido + " nao se encontra na sequencia de Fibonnaci.");
        }
         */
 /*Exercício 2*/
 /*
        System.out.println("Escreva uma frase.");
        String texto = input.nextLine();

        int quantidade = 0;

        for (int i = 0; i < texto.length(); i++) {
            char a = texto.charAt(i);

            if (a == 'a' || a == 'A') {
                quantidade++;
            }

        }

        if (quantidade == 0) {
            System.out.println("Essa frase nao possui a letra a nem uma vez.\nQuantidade de a: " + quantidade);
        } else if (quantidade == 1) {
            System.out.println("Nesta frase, ha apenas uma ocorrencia da letra a");
        } else {
            System.out.println("Nessa frase, apareceu a letra A um total de " + quantidade + " vezes.");
        }
         */
    }

}
