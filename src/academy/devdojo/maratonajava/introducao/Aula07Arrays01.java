package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {

    public static void main(String[] args) {
        String[] name = new String[4];
        name[0] = "Maria";
        name[1] = "Goku";
        name[2] = "Itachi";
        name[3] = "Naruto";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            
        }
    }
}
