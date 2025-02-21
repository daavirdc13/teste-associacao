package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepExercicio02 {
    public static void main(String[] args) {
        double totalValue = 30000;
        for (int portion = 1; portion < totalValue ; portion++) {
            double plotValue = totalValue / portion;
            if (plotValue < 1000) {
                break;
            }

            System.out.println("Portion "+ portion+" R$ "+plotValue);
        }
    }
}
