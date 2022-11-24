package oo.colecao.sabermais;

import java.util.Comparator;
import java.util.Map;

public class ComparatorMatriculaAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {
    @Override
    public int compare(Map.Entry<Disciplina, Aluno> al1, Map.Entry<Disciplina, Aluno> al2) {
        return Integer.compare(al1.getValue().getMatricula(), al2.getValue().getMatricula());
    }
}