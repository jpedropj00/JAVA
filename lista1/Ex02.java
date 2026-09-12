public class Ex02 {
    public static void main(String[] args) {
        //2. Soma dos pares. Utilizando for e if, some todos os números pares entre 1 e 100 e exiba o
        //resultado.
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 até 100 é: " + soma);
    }
}
