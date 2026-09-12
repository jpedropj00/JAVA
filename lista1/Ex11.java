import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        //11. Tabuada seletiva. Exiba a tabuada de um número escolhido (1 a 10), mas utilize if para pular a
        //exibição dos múltiplos de 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int multiplo = num * i;
            if (multiplo % 3 != 0 && multiplo > 0) {
                System.out.println(num + " x " + i + " = " + multiplo);
            }

        }
    }
}
