package estudos;

import estudospoo.classes.Aluno;
import javax.swing.*;

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

        aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 1?")));
        aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 2?")));
        aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 3?")));
        aluno1.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 4?")));

        double resultado = (aluno1.getMediaNota()) / 4 ;

        System.out.println("-----------------------------------");
        System.out.println("O nome é: " + aluno1.getNome());
        System.out.println("A idade é: " + aluno1.getIdade());
        System.out.println("A data de nascimento é: " + aluno1.getDataNascimento());
        System.out.println("A nota é: " + resultado);

        if (resultado >= 5){
            if (resultado >= 9){
                JOptionPane.showMessageDialog(null,"Você foi aprovado com louvor!");
            } else if (resultado >= 7){
                JOptionPane.showMessageDialog(null,"Você está aprovado!");
            } else {
                JOptionPane.showMessageDialog(null,"Você está em recuperação!");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Você está reprovado!");
        }
        System.out.println("-----------------------------------");

        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno();

        Aluno aluno4 = new Aluno();

        Aluno aluno5 = new Aluno();

    }
}
