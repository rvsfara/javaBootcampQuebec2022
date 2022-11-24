package oo.colecao.sabermais;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeAluno implements Comparator<Map.Entry<Disciplina,Aluno>> {
    @Override
    public int compare(Map.Entry<Disciplina, Aluno> al1, Map.Entry<Disciplina, Aluno> al2) {
        return al1.getValue().getNome().compareToIgnoreCase(al2.getValue().getNome());
    }
}