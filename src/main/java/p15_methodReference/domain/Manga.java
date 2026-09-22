package p15_methodReference.domain;

import java.util.Objects;

public class Manga {
    private String titulo;
    private int volume;
    private double preco;

    public Manga() {
        titulo = "Sem titulo";
        volume = 1;
        preco = 29.90;
    }

    public Manga(String titulo, int volume) {
        this.titulo = titulo;
        this.volume = volume;
        preco = 29.90;
    }

    public Manga(String titulo, int volume, double preco) {
        this.titulo = titulo;
        this.volume = volume;
        this.preco = preco;
    }

    public static boolean isVolumeInicial(Manga manga) {
        return manga.volume == 1;
    }

    public static int compararPorPreco(Manga a, Manga b) {
        return Double.compare(a.getPreco(), b.getPreco());
    }

    public String imprimirFicha(){
        return titulo + 'v' + volume + " - R$" + preco;
    }

    @Override
    public String toString() {
        return titulo + " v" + volume;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return volume == manga.volume && Objects.equals(titulo, manga.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, volume);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
