//09-20-2026
package p15_methodReference;

import p15_methodReference.domain.Estante;
import p15_methodReference.domain.Manga;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estante<Manga> estanteDeManga = new Estante<>();
        estanteDeManga.adicionar(new Manga("Naruto", 1, 32.90));
        estanteDeManga.adicionar(new Manga("Naruto", 2, 32.90));
        estanteDeManga.adicionar(new Manga("Berserk", 1, 79.90));
        estanteDeManga.adicionar(new Manga("Berserk", 2, 79.90));
        estanteDeManga.adicionar(new Manga("One Piece", 1, 29.90));
        estanteDeManga.adicionar(new Manga("One Piece", 2, 29.90));
        estanteDeManga.adicionar(new Manga("Akira", 1, 120));
        estanteDeManga.adicionar(new Manga("Naruto", 1, 45));

        List<Manga> barato = estanteDeManga.filtrar(m -> m.getPreco() < 50);
        List<Manga> caro = estanteDeManga.filtrar(m -> m.getPreco() > 50);
        List<Manga> mangasIniciais = estanteDeManga.filtrar(Manga::isVolumeInicial); // <- METHOD REFERENCE TEST

        System.out.println("Estante toda:" + estanteDeManga);
        System.out.println("Mangás abaixo de R$50: "+barato);
        System.out.println("Mangás acima de R$50: "+caro);
        System.out.println("Mangas iniciais: " + mangasIniciais);
    }
}
