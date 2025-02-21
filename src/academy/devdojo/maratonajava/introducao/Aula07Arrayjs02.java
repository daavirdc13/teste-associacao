package academy.devdojo.maratonajava.introducao;

public class Aula07Arrayjs02 {
    public static void main(String[] args) {
        //int[] number = new int[3];
        //int[] number = new int[]{1,2,3,4};

        int[] number = {1,2,3,4,5};

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        for (int num:number){
            System.out.println(num);
        }
    }
}
