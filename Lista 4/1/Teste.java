/*******************************************************************************
Exercício 1)
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se é uma data válida.
b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
c) Usando Delegação, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno deverá existir um atributo Data da Matricula que deverá ser do tipo Data (classe do item a)
e) Na classe Funcionário deverá existir um atributo Data de Admissão que deverá ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.

*******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Teste
 */
public class Teste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        do {
                System.out.println("""
                        Digite
                        1 - Para cadastrar um aluno
                        2 - Para Cadatar um funcionario
                        3 - Sair
                        """);
                        opcao = Integer.parseInt(entrada.nextLine());

                        switch (opcao) {
                            case 1:
                                    System.out.println("\nDigite o nome do Aluno: ");
                                    String nomeAluno = entrada.nextLine();
                                    System.out.println("\nDigite o RG do Aluno: ");
                                    String rgaluno = entrada.nextLine();
                                    System.out.println("\nDigite a data de nascimento do Aluno(string/ dia/mes/ano): ");
                                    String dataNascimentoAluno = entrada.nextLine();
                                    System.out.println("\nDigite o EA do Aluno: ");
                                    String raAluno = entrada.nextLine();
                                    System.out.println("\nDigite a data da matricula do Aluno: ");
                                    String dataMatricula = entrada.nextLine();

                                    alunos.add(new Aluno(nomeAluno, rgaluno, dataNascimentoAluno, raAluno, dataMatricula));
                                    break;
                            case 2:
                                    System.out.println("\nDigite o nome do funcionario: ");
                                    String nomeFuncionario = entrada.nextLine();
                                    System.out.println("\nDigite o RG do funcionario: ");
                                    String rgluno = entrada.nextLine();
                                    System.out.println("\nDigite a data de nascimento do funcionanrio (string/ dia/mes/ano): ");
                                    String dataNascimentoFuncionario = entrada.nextLine();
                                    System.out.println("\nDigite salario do funcionario: ");
                                    double salario = Double.parseDouble(entrada.nextLine());
                                    System.out.println("\nDigite a funcão do funcionário: ");
                                    String funcao = entrada.nextLine();

                                    System.out.println("Digite a data de admissão do funcionário: ");
                                    String dataAdmissao = entrada.nextLine();

                                    funcionarios.add(new Funcionario(nomeFuncionario, rgluno, dataNascimentoFuncionario, salario, funcao, dataAdmissao));

                                    break;
                            case 3:
                                    System.out.println("Saindo...");
                                    break;
                            default:
                                System.out.println("Opção inválida");
                        }

        } while (opcao != 3);

        
    }
}