public class Tokenizacao {
    public static void main(String[] args) {

        String entrada = "soma = 10 + 20 ;";
        String[] tokens = entrada.split(" ");

        for (String token : tokens) {

            if (token.matches("[a-zA-Z]+")) {
                System.out.println(token + " -> Identificador");
            }
            else if (token.matches("[0-9]+")) {
                System.out.println(token + " -> Número");
            }
            else if (token.equals("=")) {
                System.out.println(token + " -> Atribuição");
            }
            else if (token.equals("+")) {
                System.out.println(token + " -> Operador");
            }
            else if (token.equals(";")) {
                System.out.println(token + " -> Fim de instrução");
            }
        }
    }
}