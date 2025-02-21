package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 14;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 14;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("--------------------------------");

        for (int[] arrBase: days){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
