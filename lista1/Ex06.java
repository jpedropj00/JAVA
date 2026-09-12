import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //6. Fatorial com validação. Peça um número N e, com if, verifique se ele é negativo (exiba uma
        //mensagem de erro nesse caso); caso contrário, calcule o fatorial de N utilizando for.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        int fatorial = num;
        if (num < 0) {
            System.out.println("Digite um numero positivo");
        } else {
            if (num == 0) {
                fatorial = 1;

            } else {

                for (int i = num - 1; i >= 1; i-- ) {
                    fatorial = fatorial * i;
                };
            }
            System.out.println("Fatorial: " + fatorial);
        }
    }
}
