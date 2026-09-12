public class Ex25 {
    void main() {
            //25. Uso de continue. Utilizando for, exiba os números de 1 a 30, mas utilize if e continue para pular
        //a exibição dos múltiplos de 4.
        for (int i = 0; i <= 30; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
