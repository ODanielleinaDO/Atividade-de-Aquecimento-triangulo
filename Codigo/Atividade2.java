import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        int altura = leitor.nextInt();

        System.out.print("Digite a largura: ");
        int largura = leitor.nextInt();

       
        System.out.println("\nRetângulo completo:");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal superior direita:");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (j == largura - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        leitor.close();
    }
}