package lab_04;
import java.util.ArrayList;
import java.util.HashMap;

public class Escola {

	private HashMap<String, Aluno> mapaMatriculaAlunos = new HashMap<>();
	private HashMap<String, Grupo> mapaTemaGrupos = new HashMap<>();
	private ArrayList<Aluno> alunosQueResponderam = new ArrayList<>();
	private ArrayList<Grupo> todosOsGrupos = new ArrayList<>();
	
	public Escola() {

	}

	public boolean cadastraAluno(String matricula, String nome, String curso) {
		Aluno aluno = new Aluno(matricula, nome, curso);
		if (mapaMatriculaAlunos.containsKey(matricula)) {
			return false;
		}
		mapaMatriculaAlunos.put(matricula, aluno);
		return true;

	}

	public boolean cadastraGrupo(String tema, Integer tamanho) {
		tema = tema.toLowerCase();
		Grupo grupo = new Grupo(tema, tamanho);
		if (tamanho == null) {
			grupo = new Grupo(tema);
		} else {
			grupo = new Grupo(tema, tamanho);
		}
		if (mapaTemaGrupos.containsKey(tema)) {
			return false;
		}
		mapaTemaGrupos.put(tema, grupo);
		return true;
	}



	public String exibeAluno(String matricula) {
		if (mapaMatriculaAlunos.get(matricula) != null) {
			return mapaMatriculaAlunos.get(matricula).toString();
		}

		return null;
	}

	public String alocaAluno(String matricula, String tema) {
		tema = tema.toLowerCase();
		if (!mapaMatriculaAlunos.containsKey(matricula)) {
			return "ALUNO NÃO CADASTRADO";
		} else if (!mapaTemaGrupos.containsKey(tema)) {
			return "GRUPO NÃO CADASTRADO";

		} else if (mapaTemaGrupos.get(tema).isCheio()) {
			return "GRUPO CHEIO";

		}
		mapaTemaGrupos.get(tema).alocaAluno(mapaMatriculaAlunos.get(matricula));
		return "ALUNO ALOCADO";
	}

	public String verificaPertinencia(String matricula, String tema) {
		tema = tema.toLowerCase();
		if (!mapaTemaGrupos.containsKey(tema)) {
			return "GRUPO NÃO CADASTRADO.";	
		}else if (!mapaMatriculaAlunos.containsKey(matricula)) {
			return "ALUNO NÃO CADASTRADO";
		}
		else if (mapaMatriculaAlunos.get(matricula) == null || !mapaTemaGrupos.get(tema).verificaPertinencia(mapaMatriculaAlunos.get(matricula)))  {
			return "ALUNO NÃO PERTENCE AO GRUPO";
		} 
		return "ALUNO PERTENCE AO GRUPO";
		
		
	}

	public String registraAlunoQueRespondeu(String matricula) {
		if (! mapaMatriculaAlunos.containsKey(matricula)) {
			return "ALUNO NÃO CADASTRADO";
		}
		alunosQueResponderam.add(mapaMatriculaAlunos.get(matricula));
		return "ALUNO REGISTRADO";
	}
	
	public String imprimeAlunosQueResponderam() {
		String resultado = "";
		int numero = 1;
		for (Aluno aluno : alunosQueResponderam) {
			
			resultado += numero + ". " + aluno.toString() + System.lineSeparator();
			numero++;
		}
		return resultado;
	}
	
	public String olhaGrupoDoAluno(String matricula) {
		String resultado = "Grupos: " + System.lineSeparator();
		Grupo grupoAtual;
			for (String key : mapaTemaGrupos.keySet()) {
				grupoAtual = mapaTemaGrupos.get(key);
				if (grupoAtual.verificaPertinencia(mapaMatriculaAlunos.get(matricula))) {
					resultado += "- " + grupoAtual.getTema() + System.lineSeparator();
				}
			}if (resultado.equals("Grupos: " + System.lineSeparator())) {
				return "ALUNO SEM GRUPO";
			}
			
			return resultado;
	}
	public Integer getQuantidadeDeAlunos() {
		return mapaMatriculaAlunos.size();
	}
	public Integer getQuantidadeDeGrupos() {
		return mapaTemaGrupos.size();
	}
}