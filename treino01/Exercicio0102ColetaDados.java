package treino01;

import java.util.*;

public class Exercicio0102ColetaDados extends Exercicio0101Alunos {

    Scanner scan = new Scanner(System.in);
    Exercicio0101Alunos aluno = new Exercicio0101Alunos();

    public void ColetaDados() {

        System.out.print("Digite o seu nome: ");
        aluno.setNome(scan.nextLine());

        System.out.print("Digite sua sala: ");
        aluno.setSala(scan.nextInt());

        scan.nextLine();
        System.out.print("Digite sua turma: ");
        aluno.setTurma(scan.nextLine());

        System.out.print("Digite o ano de nascimento: ");
        aluno.setAnoNasc(scan.nextInt());

    }

    public void Imprimi() {
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("Conforme informações passadas, o aluno " + aluno.getNome() + " tem os seguintes dados: ");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sala: " + aluno.getSala());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Ano de Nascimento: " + aluno.getAnoNasc());
        System.out.println("Ano atual: " + aluno.getAnoAtual());

    }

    public void exercicio() {
        //calcule a idade da pessoa
        //Se idade for menor que 12 mostre "Está pessoa esta na fase infantil".
        //Se idade for entre 12 e 18 mostre " Está pessoa está na fase da Adolescência".
        //Caso seja maior de 18 mostre " Está na fase adulta".
        int idade = (aluno.getAnoAtual() - aluno.getAnoNasc());
        if (idade >= 0 && idade <= 12) {
            System.out.println("Idade do " + aluno.getNome() + " é " + idade + "anos . Está pessoa esta na fase infantil.");
        } else if (idade > 12 && idade <= 18) {
            System.out.println("Idade do " + aluno.getNome() + " é " + idade + "anos . Está pessoa está na fase da Adolescência.");
        } else {
            System.out.println("Idade do " + aluno.getNome() + " é " + idade + "anos . Está na fase adulta.");
        }
    }
}
