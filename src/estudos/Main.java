package estudos;

import estudospoo.classes.Aluno;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do Aluno(a)?");

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);

        String idade = JOptionPane.showInputDialog("Qual a idade de " + aluno1.getNome() + "?");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento de " + aluno1.getNome() + "?");
        String registroGeral = JOptionPane.showInputDialog("Qual o registro geral de " + aluno1.getNome() + "?");
        String numeroCpf = JOptionPane.showInputDialog("Qual o cpf de " + aluno1.getNome() + "?");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe de " + aluno1.getNome() + "?");
        String nomePai = JOptionPane.showInputDialog("Qual o nome do pai de " + aluno1.getNome() + "?");
        String dataMatriculada = JOptionPane.showInputDialog("Qual a data da matricula de " + aluno1.getNome() + "?");
        String serieMatriculada = JOptionPane.showInputDialog("Qual qual a serie matriculada de " + aluno1.getNome() + "?");
        String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola de " + aluno1.getNome() + "?");
        String disciplina1 = JOptionPane.showInputDialog("Qual o nome da disciplina 1 de " + aluno1.getNome() + "?");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1 de " + aluno1.getNome() + "?");
        String disciplina2 = JOptionPane.showInputDialog("Qual o nome da disciplina 2 de " + aluno1.getNome() + "?");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2 de " + aluno1.getNome() + "?");
        String disciplina3 = JOptionPane.showInputDialog("Qual o nome da disciplina 3 de " + aluno1.getNome() + "?");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3 de " + aluno1.getNome() + "?");
        String disciplina4 = JOptionPane.showInputDialog("Qual o nome da disciplina 4 de " + aluno1.getNome() + "?");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4 de " + aluno1.getNome() + "?");

        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatriculada);
        aluno1.setSerieMatriculado(serieMatriculada);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setDisciplina1(disciplina1);
        aluno1.setDisciplina2(disciplina2);
        aluno1.setDisciplina3(disciplina3);
        aluno1.setDisciplina4(disciplina4);
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println("O nome é: " + aluno1.getNome());
        System.out.println("O RG é: " + aluno1.getRegistroGeral());
        System.out.println("A idade é: " + aluno1.getIdade());
        System.out.println("A data de nascimento é: " + aluno1.getDataNascimento());
        System.out.println("A nota é: " + aluno1.getMediaNota());
        System.out.println("O aluno foi: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println(aluno1.getAlunoAprovado2());
        System.out.println(aluno1);
    }
}
