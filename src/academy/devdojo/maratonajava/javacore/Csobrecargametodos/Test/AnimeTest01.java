package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 720, "Comédia");
        anime.imprime();

    }
}
