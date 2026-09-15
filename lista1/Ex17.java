package lista1;

import java.util.Scanner;

public class Ex17 {
    void main() {
        //17. Contagem de dígitos. Utilizando while e divisão inteira, conte e exiba quantos dígitos possui
        //um número inteiro informado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int cont = 0;
        if (num == 0) {
            cont = 1;
        } else {
            while (num != 0) {
                cont++;
                num = num / 10;
            }

        }
        System.out.println(cont);
    }
}
