import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int altura;

        do {
            System.out.print("Digite a altura (1 a 20): ");
            altura = leitor.nextInt();
        } while (altura < 1 || altura > 20);

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        leitor.close();
    }
}