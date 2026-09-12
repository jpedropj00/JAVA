    import java.util.Scanner;

    public class Ex23 {
        void main() {
            //23. Palavra palíndroma. Utilizando for, compare os caracteres de uma palavra do início para o fim
            //e do fim para o início, verificando com if se ela é palíndroma (ex.: "arara").
            Scanner input = new Scanner(System.in);
            System.out.println("Digite uma palavra: ");
            String palavra = input.nextLine();
            palavra = palavra.toUpperCase().replaceAll(" ", "");
            boolean isPalindroma = true;
            for (int i = 0; i <= palavra.length(); i++) {
                if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                    isPalindroma = false;
                    break;
                }
            }
            if (isPalindroma) {
                System.out.println("Palindromo");
            } else {
                System.out.println("Não Palindromo");
            }

        }
    }
