package estudos;

import estudospoo.classes.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(); /* Este será o João */

        Aluno aluno2 = new Aluno(); /* Este será o Pedro */

        Aluno aluno3 = new Aluno(); /* Este será o Alex */

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("José", 50);

    }
}
