/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100
 * contatos.
 * 
 * @author nazareno
 *
 */
public class Agenda {

	private static final int TAMANHO_AGENDA = 100;
	private static final int TAMANHO_FAVORITOS = 10;

	Contatos[] contatos;
	Contatos[] favoritos;
	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contatos[TAMANHO_AGENDA];
		this.favoritos = new Contatos[TAMANHO_FAVORITOS];
	}

	/**
	 * Acessa a lista de contatos mantida.
	 * 
	 * @return O array de contatos.
	 */
	public Contatos[] getContatos() {
		return this.contatos.clone();
	}

	/**
	 * Acessa os dados de um contato específico.
	 * 
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public String getContato(int posicao) {
		if (contatos[posicao - 1] == null) {
			return null;
		}
		return contatos[posicao - 1].toString();
	}

	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe
	 * sobrescreve o anterior.
	 * 
	 * @param posicao   Posição do contato.
	 * @param nome      Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone  Telefone do contato.
	 */
	public void cadastraContato(int posicao, Contatos contato) {
		this.contatos[posicao-1] = contato;
	}

	/**
	 * Formata um contato para impressão na interface.
	 * 
	 * @param posicao A posição do contato (que é exibida)/
	 * @param contato O contato a ser impresso.
	 * @return A String formatada.
	 */
	public String formataContato(int posicao, Contatos contato) {
		return (posicao + 1) + " - " + contato.nomeCompleto();
	}

	public boolean isCadastrado(Contatos contato) {
		
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				return false;
			}
			if (contato.equals(contatos[i])) {
				return true;
			}
		}
		return false;
	}
public boolean isFavorito(int favorito) {
		Contatos cont = contatos[favorito - 1];
		for (int i = 0; i < favoritos.length; i++) {
			if (!(favoritos[i] == null)){
				if (cont.equals(favoritos[i])) {
				return true;
			}
			}
		}
		return false;
	}
	public void adicionarFavorito(int contato, int posicao) {
		 favoritos[posicao - 1] = contatos[contato - 1];
		 contatos[contato - 1].adiconaCoracao();
	}
public Contatos[] listarFavoritos() {
		return favoritos;
	}

}