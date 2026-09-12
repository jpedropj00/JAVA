import java.util.Scanner;

public class Ex15 {
    void main() {
        //15. Palíndromo numérico. Utilizando while, inverta os dígitos de um número inteiro e, com if,
        //verifique se o número original é igual ao invertido (palíndromo).
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        String numString = String.valueOf(num);
        int cont = 0;
        StringBuilder numStringReverse = new StringBuilder();
        while (cont != numString.length()) {
            numStringReverse.append(numString.charAt(numString.length() - cont - 1));
            cont++;
        }
        System.out.println(numStringReverse);
        System.out.println(numString);
        if (numStringReverse.toString().equals(numString)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não palindromo");
        }

    }
}
