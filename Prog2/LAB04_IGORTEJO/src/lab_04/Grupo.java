package lab_04;
import java.util.HashMap;

public class Grupo {
	
	private String tema;
	private Integer tamanho;
	private HashMap<String, Aluno> mapaGrupoAlunos = new HashMap<>();


	public Grupo(String tema) {
		this.tema = tema;
	}
	
	public Grupo(String tema, Integer tamanho) {
		this.tema = tema;
		this.setTamanho(tamanho);
	}
	
	
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Integer getTamanho() {
		return tamanho;
	}
	public Integer getTamanhoAtual() {
		return mapaGrupoAlunos.size();
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	/**
	 * Verifica se aquele determinado grupo ta cheio.
	 * @author igor
	 *
	 */
	public boolean isCheio() {
		return (mapaGrupoAlunos.size() == this.getTamanho());
	}
	/**
	 * Aloca o aluno de fato a um grupo.
	 * @author igor
	 *
	 */
	public void alocaAluno(Aluno aluno) {
		this.mapaGrupoAlunos.put(aluno.getMatricula(), aluno);
	}
	
	/**
	 * Verifica se o aluno existe naquele grupo ou não.
	 * @author igor
	 *
	 */
	public boolean verificaPertinencia(Aluno aluno) {
		if (this.mapaGrupoAlunos.containsKey(aluno.getMatricula())) {
			return true;
		}return false;
	}
	

}
