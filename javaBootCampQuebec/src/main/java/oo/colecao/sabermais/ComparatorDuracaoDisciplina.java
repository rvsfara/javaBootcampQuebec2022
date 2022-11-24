package oo.colecao.sabermais;

import java.util.Comparator;

public class ComparatorDuracaoDisciplina implements Comparator<Disciplina> {
    @Override
    public int compare(Disciplina disc1, Disciplina disc2) {
        return Integer.compare(disc1.getDuracao(), disc2.getDuracao());
    }
}