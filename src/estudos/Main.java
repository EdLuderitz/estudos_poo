package estudos;

import estudospoo.classes.Aluno;

public class Main {

    public static void main(String[] args) {

        /* Aluno é um atributo */
        /* new Aluno() é uma instância (Criação de objeto) */
        /* a variavel aluno1 é uma referência para o objeto aluno*/

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João da Silva");

        System.out.println("O nome é: " + aluno1.getNome());

        Aluno aluno2 = new Aluno(); /* Este será o Pedro */

        Aluno aluno3 = new Aluno(); /* Este será o Alex */

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("José", 50);

    }
}
