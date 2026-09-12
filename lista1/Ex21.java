import java.util.Scanner;

public class Ex21 {
    void main() {
        //21. Contagem de vogais. Percorra uma frase caractere a caractere com for e charAt(), utilizando if
        //para contar quantas vogais ela contém.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine();
        palavra = palavra.toUpperCase().replaceAll(" ", "");
        int cont = 0;
        for (int i = 0; i <= palavra.length() - 1; i++) {
            if (palavra.charAt(i) == 'A' ||  palavra.charAt(i) == 'E' || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'O'||palavra.charAt(i) == 'U' ) {
                cont++;
            }

        }
        System.out.println(cont);

    }
}
