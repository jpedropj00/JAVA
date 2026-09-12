import java.util.Scanner;

public class Ex31 {
    void main() {
        //31. Positivos, negativos e zeros. Leia N valores em um laço e, com if/else if/else, conte quantos
        //números são positivos, quantos são negativos e quantos são iguais a zero.
        Scanner sc = new  Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int numFor, qtdPositivos = 0, qtdNegativos = 0, qtdZeros= 0;
        if (num < 0) {
            System.out.println("Número inválido");
        } else {
            for (int i = 0; i <= num; i++) {
                System.out.println("Digite o " + num + "° valor a ser lido: ");
                numFor = sc.nextInt();
                if (numFor % 2 == 0 && numFor != 0) {
                    qtdPositivos++;
                } else if (numFor == 0) {
                    qtdZeros++;
                } else {
                    qtdNegativos++;
                }
            }
            System.out.println("Quantidade de positivos: " + qtdPositivos);
            System.out.println("Quantidade de negativos: " + qtdNegativos);
            System.out.println("Quantidade de zeros: " + qtdZeros);
        }
    }
}
