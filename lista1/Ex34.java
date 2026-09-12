import java.util.Scanner;

public class Ex34 {
    void main() {
        //34. MDC (Euclides). Utilizando while, implemente o algoritmo de Euclides para calcular o
        //Máximo Divisor Comum (MDC) entre dois números inteiros.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o núm 1: ");
        int n1 = Math.abs(input.nextInt());
        System.out.println("Digite o num 2: ");
        int n2 = Math.abs(input.nextInt());
        while (n2 != 0) {
            int resto = n1 % n2;
            n1 = n2;
            n2 = resto;
        }
        System.out.println("MDC = " + n1);
    }
}
