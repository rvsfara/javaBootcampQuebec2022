package oo.colecao.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

    System.out.println("--\tOrdem aleatória\t--");
    Set<Serie> minhasSeries = new HashSet<>(){{
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
    }};
    for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());

    System.out.println("--\tOrdem inserção\t--");
    Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
    }};
    for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());

    System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());

    System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
    Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
    minhasSeries3.addAll(minhasSeries);
    for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());

//Pra você
/*        System.out.println("--\tOrdem gênero\t--");
          System.out.println("--\tOrdem Tempo Episódio\t--");
 */

    }
}