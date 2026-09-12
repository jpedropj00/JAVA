import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        //9. Contagem regressiva. Utilizando while, exiba a contagem regressiva de um número N até 1 e,
        //ao final, imprima "Decolagem!".
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        while (num > 0) {

            System.out.println(num);
            num --;
        }
        System.out.println("Decolagem!");
    }
}
