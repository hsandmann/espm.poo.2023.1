package espm.aula01;

public class Exemplo5 {

    public static void main(String[] args) {

        Professor p1 = new Professor();
        p1.id = "4466";
        p1.nome = "Humberto";

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        Sala sala = new Sala();
        sala.nome = "3ab the ones";
        sala.professor = p1;
        sala.alunos.add(a1);
        sala.alunos.add(a2);

        System.out.println(sala);

    }
    
}
