package com.matheusgr.lunr.documento;



/**
 * Documento de texto simples. Não precisa de tratamento complexos nem tem
 * metadados próprios.
 */
class DocumentoTexto extends AbstractDocumento {

	/**
	 * Construtor padrão do documento de texto.
	 * @param id ID do documento.
	 * @param txt Texto do documento.
	 */
	public DocumentoTexto(String id, String txt) {
		super(id, txt);
	}

}
