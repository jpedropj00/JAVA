import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args ) {
        //14. Aprovados x reprovados. Para uma turma de N alunos (lidos em laço), utilize if para contar
        //quantos foram aprovados (média >= 7) e quantos foram reprovados, exibindo os totais ao final.
        Scanner sc  = new Scanner(System.in);
        int qtdAlunos, qtdNotas, contAprovados = 0;
        System.out.println("Quantos alunos tem na turma? ");
        qtdAlunos = sc.nextInt();
        System.out.println("Quantos notas tem cada aluno? ");
        qtdNotas = sc.nextInt();

        for (int i = 1; i <= qtdAlunos; i ++) {
            double media = 0;
            for (int j = 1; j <= qtdNotas; j ++) {
                System.out.println("Digite a nota do aluno " + i + ":");
                double nota = sc.nextDouble();
                media += nota;
            }
            media = media / qtdNotas;
            if (media >= 7) {
                contAprovados ++;
            }
        }
        System.out.println(qtdAlunos + "Alunos totais");
        System.out.println(contAprovados + " alunos aprovados");
        System.out.println(qtdAlunos - contAprovados + " alunos reprovados");
    }
}
