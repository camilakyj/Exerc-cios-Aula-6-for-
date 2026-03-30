// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int totalAlunos = 6;
        double somaMedias = 0;
        int aprovados = 0, exame = 0, reprovados = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Aluno " + i + ":");


            System.out.print("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.println("Média:" + media);

            if (media <= 3) {
                System.out.println("Situação: REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("Situação: EXAME");
                exame++;
            } else {
                System.out.println("Situação: APROVADO");
                aprovados++;

            }
            System.out.println();

            System.out.println("Total de alunos aprovados:" + aprovados);
            System.out.println("Total de alunos de exame:" + exame);
            System.out.println("Total de alunos reprovados" + reprovados);

            double mediaClasse = somaMedias / totalAlunos;
            System.out.println("Média da classe:" + mediaClasse);



        }

    }
}


