package espm.aula01;

public class Professor {

    String id = "4466";
    String nome = "Humberto";
    String materias = "MD, POO";
    double salarioHora = 150;

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Professor) &&
            ((Professor) obj).id.equals(this.id);
    }

    @Override
    public String toString() {
        return "{" + id + ": " + nome + "}";
    }

}
