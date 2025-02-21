package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numberBig = 100000;
        double wageDouble = 2000.0;
        float wageFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Um graaaaande texto";

        System.out.println("A idade é "+age+" anos");
        System.out.println(age);
        System.out.println(nome);
    }
}
