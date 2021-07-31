
public class Contatos {
	String nome = "";
	String sobrenome = "";
	String telefone = "";
	public Contatos (String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	public Contatos (String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone Telefone do contato.
	 */
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String toString() {
		return nome + " " + sobrenome + "\n" + telefone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.nomeCompleto().equals(((Contatos) obj).nomeCompleto())) {
			return true;
		}
		return false;
	}
	
}
