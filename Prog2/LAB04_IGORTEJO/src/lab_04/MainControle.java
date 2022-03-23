package lab_04;

import java.util.Scanner;

/**
 * Interface para comunicação com o usuário, entrada e saída de dados.
 * @author igor
 *
 */

public class MainControle {

	public static void main(String[] args) {
		Escola escola = new Escola();

		Scanner scanner = new Scanner(System.in);

		String escolha = "";
		while (true) {
			escolha = menu(scanner);
			comando(escolha, escola, scanner);
		}
	}
	
	/** Exibe o menu para capturar a entrada do usuário.
	 * @author igor
	 *
	 */
	private static String menu(Scanner scanner) {
		System.out.println("\n---\nMENU\n" + "(C)adastrar Aluno\n" + "(E)xibir Aluno\n" + "(N)ovo Grupo\n"
				+ "(A)locar Aluno no Grupo e Verificar pertinência a Grupos\n" + "(R)egistrar Aluno que Respondeu\n"
				+ "(I)mprimir Alunos que Responderam\n" + "(O)lhaí quais Grupos o Aluno Tá.\n"
				+ "(S)im, quero Fechar o Programa!\n" + "\n" + "Opção> ");
		return scanner.next().toUpperCase();
	}
	/**
	 * Cadastra um aluno na escola.
	 * @author igor
	 *
	 */
	public static void cadastraAluno(Escola escola, Scanner scanner) {

		System.out.println("Matrícula: ");
		String matricula = scanner.next();
		System.out.println("Nome: ");
		String nome = scanner.next();
		System.out.println("Curso: ");
		String curso = scanner.next();
		if (escola.cadastraAluno(matricula, nome, curso)) {
			System.out.println("CADASTRO REALIZADO!");
		} else {
			System.out.println("MATRÍCULA JÁ CADASTRADA!");
		}
	}
	/** 
	 * Imprime os detalhes daquele aluno específico.
	 * escola A escola
	 * scanner para capturar qual o aluno
	 * @author igor
	 *
	 */
	public static void exibeAluno(Escola escola, Scanner scanner) {

		System.out.println("Matrícula: ");
		String matricula = scanner.next();
		String resultado = escola.exibeAluno(matricula);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Aluno não cadastrado!");
		}

	}
	/** 
	 * Cadastra o grupo a escola.
	 * @author igor
	 *
	 */
	public static void cadastraGrupo(Escola escola, Scanner scanner) {
		System.out.println("Grupo: ");
		String grupo = scanner.next();
		System.out.println("Tamanho: ");
		Integer tamanho = scanner.nextInt();
		if (escola.cadastraGrupo(grupo, tamanho)) {
			System.out.println("CADASTRO REALIZADO!");
		} else {
			System.out.println("GRUPO JÁ CADASTRADO!");
		}
	}

	/**
	 * Pergunta ao usuário se ele quer alocar um aluno ao grupo
	 * ou verificar a existencia desse aluno a determinado grupo.
	 * @author igor
	 *
	 */
	public static void alocaOuPertinenciaNoGrupo(Escola escola, Scanner scanner) {
		System.out.println("(A)locar Aluno ou (P)ertinência a Grupo?");
		String escolha = scanner.next();
		if (escolha.equals("A") || escolha.equals("a")) {
			System.out.println("Matricula: ");
			String matricula = scanner.next();
			System.out.println("Grupo: ");
			String tema = scanner.next();
			System.out.println(escola.alocaAluno(matricula, tema));
		} else {
			System.out.println("Matricula: ");
			String matricula = scanner.next();
			System.out.println("Grupo: ");
			String tema = scanner.next();
			System.out.println(escola.verificaPertinencia(matricula, tema));
		}
	}
	/** 
	 * Registra os alunos que responderam as questões feitas pelo professor
	 * @author igor
	 *
	 */
	public static void registraAlunoQueRespondeu(Escola escola, Scanner scanner) {
		System.out.println("Matricula: ");
		String matricula = scanner.next();
		System.out.println(escola.registraAlunoQueRespondeu(matricula));
	}
	/**
	 * Verifica quais os grupos que determinado aluno esta.
	 * @author igor
	 *
	 */
	public static void olhaGrupoDoAluno(Escola escola, Scanner scanner) {
		System.out.println("Matricula: ");
		String matricula = scanner.next();
		System.out.println(escola.olhaGrupoDoAluno(matricula));
	}

	public static void fechaPrograma() {
		System.exit(0);
	}
	/** Interpreta a opção escolhida pelo usuário.
	 * opcao é a escolha do usuário
	 * escola a classe escola para termos acesso a ela
	 * scanner objeto scanner para se precisar de mais inputs
	 * @author igor
	 *
	 */
	private static void comando(String opcao, Escola escola, Scanner scanner) {
		switch (opcao) {
		case "C":
			cadastraAluno(escola, scanner);
			break;
		case "E":
			exibeAluno(escola, scanner);
			break;
		case "N":
			cadastraGrupo(escola, scanner);
			break;
		case "A":
			alocaOuPertinenciaNoGrupo(escola, scanner);
			break;
		case "R":
			registraAlunoQueRespondeu(escola, scanner);
			break;
		case "I":
			System.out.println(escola.imprimeAlunosQueResponderam());
			break;
		case "O":
			olhaGrupoDoAluno(escola, scanner);
			break;
		case "S":
			fechaPrograma();
			break;
		default:
			System.out.println("Opção inválida!");
		}

	}
}
