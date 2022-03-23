package com.matheusgr.lunr.documento;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import biblitex.TransformaTexto;

public class AbstractDocumento implements Documento {

	protected String id;
	protected String tipoOriginal;
	protected String limpo;
	protected String[] split;
	protected Map<String, String> metadados;

	
	public AbstractDocumento(String id, String tipo) {
		this.id = id;
		this.tipoOriginal = tipo;
		var transformaTexto = new TransformaTexto();
		var temp = transformaTexto.transforma(TransformaTexto.Algoritmos.java, tipoOriginal);
		this.limpo = (new TransformaTexto()).transforma(TransformaTexto.Algoritmos.clean, temp).strip();
 
	}

	@Override
	public double metricaTextoUtil() {
		long extractedSize = (new TransformaTexto()).transforma(TransformaTexto.Algoritmos.cleanSpaces, this.limpo).length();
		return (1.0 * extractedSize) / this.tipoOriginal.length();	
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String[] getTexto() {
		if (this.split == null) {
			this.split = (new TransformaTexto()).transforma(TransformaTexto.Algoritmos.cleanLines, this.limpo).split(" ");
			Arrays.sort(this.split);
		}
		return this.split;	
	}

	@Override
	public Map<String, String> getMetadados() {
		if (this.metadados != null) {
			return this.metadados;
		}
		this.metadados = new HashMap<String, String>();
		this.metadados.put("LINHAS", "" + this.tipoOriginal.chars().filter((value) -> '\n' == value).count());
		this.metadados.put("TAMANHO", "" + this.limpo.length());
		this.metadados.put("METADATADATE", "" + System.currentTimeMillis());
		this.metadados.put("TIPO", "" + "txt");
		return this.metadados;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentoTexto other = (DocumentoTexto) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "===" + this.id + System.lineSeparator() + this.limpo;
	}

}
