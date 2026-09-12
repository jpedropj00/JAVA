import java.util.Scanner;

public class Ex39 {
    void main() {
        //39. Números triangulares. Utilizando for e if, encontre e exiba os números triangulares (1, 3, 6,
        //10, 15, ...) até um limite N informado.
        Scanner input = new Scanner(System.in);
        System.out.println("Digie um número: ");
        int numMax = input.nextInt();

        for (int i = 1; i <= numMax; i++) {
            int soma = 0;
            for (int j = 1; j <= i; j++) {
                soma = soma + j;
                if (soma == i) {
                    System.out.println(i + " é triangular");
                    break;
                }
                if (soma > i) {
                    break;
                }
            }
        }
    }
}
