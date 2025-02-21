package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondExercicio {
    public static void main(String[] args) {
        double salario = 45000;

        double percentual;
        if (salario <= 34712) {
            percentual = 9.70;
        } else if (salario > 34712 && salario < 68508) {
            percentual = 37.35;
        } else {
            percentual = 49.50;
        }

        double valor = (percentual / 100) * salario;
        System.out.printf("O valor taxado é de: %.2f\n", valor);
    }
}
