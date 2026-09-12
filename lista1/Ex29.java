public class Ex29 {
    void main() {
        //29. Anos bissextos. Utilizando for, percorra os anos de 2000 a 2030 e, com if (utilizando
        //operadores relacionais e lógicos), indique quais são anos bissextos.
        for (int i = 2000; i <= 2030; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 4 == 0 && i % 100 == 0 && i % 400 == 0)) {
                System.out.println("Ano " + i + " é bissexto");
            }
        }
    }
}
