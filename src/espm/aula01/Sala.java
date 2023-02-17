package espm.aula01;

import java.util.HashSet;
import java.util.Set;

public class Sala {

    String nome = null;
    Professor professor = null;

    Set<Aluno> alunos = new HashSet<Aluno>();

    @Override
    public String toString() {
        return "{ \"nome\": " + nome
        + ", \"professor\": " + professor
        + ", \"alunos\": " + alunos
        + "}";
    }
    
}
