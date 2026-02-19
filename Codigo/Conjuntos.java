import java.util.ArrayList;

public class Conjuntos {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> uniao = new ArrayList<>();
        ArrayList<Integer> intersecao = new ArrayList<>();

        A.add(1); A.add(2); A.add(3);
        B.add(2); B.add(3); B.add(4);

       
        for (int num : A) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }

        for (int num : B) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }

        for (int num : A) {
            if (B.contains(num) && !intersecao.contains(num)) {
                intersecao.add(num);
            }
        }

        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);
    }
}   