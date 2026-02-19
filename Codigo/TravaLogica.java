import java.util.Scanner;

public class TravaLogica {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a senha (formato 1-2-3): ");
        String entrada = leitor.nextLine();

        int estado = 0;

        for (char c : entrada.toCharArray()) {

            switch (estado) {
                case 0:
                    if (c == '1')
                        estado = 1;
                    else
                        estado = 0;
                    break;

                case 1:
                    if (c == '-')
                        estado = 1;
                    else if (c == '2')
                        estado = 2;
                    else
                        estado = 0;
                    break;

                case 2:
                    if (c == '-')
                        estado = 2;
                    else if (c == '3')
                        estado = 3;
                    else
                        estado = 0;
                    break;
            }
        }

        if (estado == 3) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Senha incorreta!");
        }

        leitor.close();
    }
}