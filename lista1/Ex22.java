import java.util.Scanner;

public class Ex22 {
    void main(){
        //22. Maiúsculas e minúsculas. Percorra uma String com for e, utilizando if/else, conte quantos
        //caracteres são letras maiúsculas e quantos são minúsculas.
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();
        String palavraUpper = palavra.toUpperCase();
        int contMaiusculas = 0, contMinusculas = 0;
        for (int i = 0; i < palavra.length() - 1; i++) {
            if (palavra.charAt(i) == palavraUpper.charAt(i)) {
                contMaiusculas++;
            } else {
                contMinusculas++;
            }
        }
        System.out.println("Palavra: " + palavra);
        System.out.println(contMaiusculas);
        System.out.println(contMinusculas);

    }
}
