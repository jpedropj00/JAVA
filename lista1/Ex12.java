package lista1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        //12. Maior e menor valor. Leia (ou simule a leitura de) N números em um laço e, comparando com
        //if a cada novo valor, determine e exiba o maior e o menor número informado.
        Scanner input = new Scanner(System.in);
        Integer maiorValor = null, menorValor = null, qtdNumeros;
        System.out.print("Digite a quantidade de números lidos: ");
        qtdNumeros = input.nextInt();
        if (qtdNumeros <= 0) {
            System.out.print("Número inválido");
        } else {
            for (int i = 0; i < qtdNumeros; i++) {
                System.out.println("Digite um número: ");
                int num = input.nextInt();
                if (i == 0) {
                    maiorValor = num;
                    menorValor = num;
                } else {
                    if (num > maiorValor) {
                        maiorValor = num;
                    } else if (num < menorValor) {
                        menorValor = num;
                    }
                }

            }
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
        }

    }
}
