import java.util.Scanner;

public class Ex19 {
    void main() {
        //19. Inversão de dígitos. Utilizando while, inverta a ordem dos dígitos de um número inteiro (ex.:
        //1234 → 4321) e exiba o resultado.
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int numInvertido = 0;
        while (num != 0) {
            int digito = num % 10;
            numInvertido = numInvertido * 10 + digito ;
            num = num / 10;
        }
        System.out.println("Número invertido: " + numInvertido);
    }
}
