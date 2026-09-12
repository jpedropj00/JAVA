import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        //13. Classificação de notas. Leia N notas em um laço, calcule a média de cada aluno e, com if/else
        //if/else, classifique-o em "Aprovado", "Recuperação" ou "Reprovado".
        Scanner input = new Scanner(System.in);
        Integer qtdNotas;
        double media = 0;
        System.out.print("Digite a quantidade de notas: ");
        qtdNotas = input.nextInt();
        if (qtdNotas > 0) {
            for (int i = 0; i < qtdNotas; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                double nota = input.nextDouble();
                media += nota;
            }
            media = media / qtdNotas;
            System.out.println("A média do aluno é: " + media);
        } else {
            System.out.print("Número inválido");
        }
    }
}
