import java.util.Scanner;

public class Ex40 {
    void main() {
        //40. Sistema de login. Utilizando do-while, permita até 3 tentativas de digitação de senha. A cada
        //tentativa incorreta, utilize if para informar quantas tentativas ainda restam; após a 3a tentativa
        //incorreta, bloqueie o acesso.
        Scanner input = new Scanner(System.in);
        final int NUMERO_TENTATIVAS = 3;
        int numTentativasUser = 0;
        final String SENHA = "Minhasenha123";
        do {
            System.out.println("SISTEMA DE LOGIN INICIADO");
            System.out.println("Digite sua senha: ");
            String tentativaSenha = input.nextLine();
            if (tentativaSenha.equals(SENHA)) {
                System.out.println("Senha correta. User logado");
                break;
            } else {
                numTentativasUser++;
                System.out.println("Senha inválida, tente novamente");
                System.out.println("Restam " + (NUMERO_TENTATIVAS - numTentativasUser) + " tentativas");
            }
        } while (NUMERO_TENTATIVAS != numTentativasUser);
    }
}
