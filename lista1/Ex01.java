import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 1. Pares e ímpares. Utilizando um for de 1 até N, exiba para cada número se ele é "Par" ou "Ímpar"
        //(if/else).
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par!");
            }

        }
    }
}
