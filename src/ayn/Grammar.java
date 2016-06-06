package ayn;

import java.util.LinkedList;
import java.util.List;

public class Grammar {
	private LinkedList<Simbolo> conjuntoSimboloTerminal;
	private LinkedList<Simbolo> conjuntoSimboloNonTerminal;
	private LinkedList<Producao> conjuntoProducoes;
	
	public Grammar() {
		this.conjuntoSimboloTerminal = new LinkedList<>();
		this.conjuntoSimboloNonTerminal = new LinkedList<>();
		this.conjuntoProducoes = new LinkedList<>();
	}
	
	public void atribuiProducao(List<String> linhas) {
		
	}
	
	public LinkedList<Producao> getConjuntoProducoes() {
		return conjuntoProducoes;
	}
	public void setConjuntoProducoes(LinkedList<Producao> conjuntoProducoes) {
		this.conjuntoProducoes = conjuntoProducoes;
	}
	public LinkedList<Simbolo> getConjuntoSimboloNonTerminal() {
		return conjuntoSimboloNonTerminal;
	}
	public void setConjuntoSimboloNonTerminal(String[] linhaRecebida) {
		for(String c : linhaRecebida) {
			this.conjuntoSimboloNonTerminal.add(new Simbolo(c.charAt(0)));
		}
	}
	public LinkedList<Simbolo> getConjuntoSimboloTerminal() {
		return conjuntoSimboloTerminal;
	}
	public void setConjuntoSimboloTerminal(String[] linhaRecebida) {
		for(String c : linhaRecebida) {
			this.conjuntoSimboloTerminal.add(new Simbolo(c.charAt(0)));
		}
	}
	
	

}
