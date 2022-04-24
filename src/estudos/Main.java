package estudos;

import estudospoo.classes.Aluno;

public class Main {

    public static void main(String[] args) {

        /* Aluno é um atributo */
        /* new Aluno() é uma instância (Criação de objeto) */
        /* a variavel aluno1 é uma referência para o objeto aluno*/

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João da Silva");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("18/10/1997");
        aluno1.setRegistroGeral("44554.4554.545");
        aluno1.setNumeroCpf("1235498775");
        aluno1.setNomeMae("Shirlei");
        aluno1.setNomePai("Antonio");
        aluno1.setDataMatricula("10/01/2019");
        aluno1.setSerieMatriculado("5");
        aluno1.setNomeEscola("Escola JDEV Treinamento");

        System.out.println("O nome é: " + aluno1.getNome());
        System.out.println("A idade é: " + aluno1.getIdade());
        System.out.println("A data de nascimento é: " + aluno1.getDataNascimento());

        System.out.println("-----------------------------------");

        Aluno aluno2 = new Aluno(); /* Este será o Pedro */
        aluno2.setNome("Pedro");
        aluno2.setIdade(40);
        aluno2.setDataNascimento("10/10/1991");

        System.out.println("O nome é: " + aluno2.getNome());
        System.out.println("A idade é: " + aluno2.getIdade());
        System.out.println("A data de nascimento é: " + aluno2.getDataNascimento());


        Aluno aluno3 = new Aluno(); /* Este será o Alex */

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("José", 50);

    }
}
