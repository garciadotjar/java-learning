package p15_methodReference.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Estante<T> {
    private List<T> itens = new ArrayList<>();

    public boolean adicionar(T item){
        if (itens.contains(item)) {
            return false;
        }

        itens.add(item);
        return true;
    }

    public List<T> filtrar(Predicate<T> p) {
        List<T> resultado = new ArrayList<>();

        for (T item : itens) {
            if (p.test(item)) {
                resultado.add(item);
            }
        }

        return resultado;
    }

    public void paraCada(Consumer<T> c) {
        for (T item : itens) {
            c.accept(item);
        }
    }

    public <K> Map<K, List<T>> agruparPor(Function<T, K> classificador) {
        Map<K, List<T>> resultado = new LinkedHashMap<>();

        for (T item : itens) {
            K chave = classificador.apply(item);

            if (!resultado.containsKey(chave)) {
                resultado.put(chave, new ArrayList<>());
            }

            resultado.get(chave).add(item);
        }

        return resultado;
    }

    public List<T> ordenar(Comparator<T> c) {
        List<T> resultado = new ArrayList<>(itens);

        resultado.sort(c);

        return resultado;
    }

    public void copiarPara(List<? super T> destino) {
        destino.addAll(itens);
    }

    public static <T> List<T> criarVazios(int qtd, Supplier<T> fabrica) {
        List<T> resultado = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            resultado.add(fabrica.get());
        }

        return resultado;
    }

    public static double somarPrecos(List<? extends Manga> lista) {
        double total = 0;

        for (Manga manga : lista) {
            total += manga.getPreco();
        }

        return total;
    }

    public int tamanho() {
        return itens.size();
    }

    public List<T> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder();
        for (T item : itens) {
            txt.append(" - ").append(item.toString()).append(" - ");
        }
        return txt.toString();
    }
}
