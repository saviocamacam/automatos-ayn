package ayn;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Grammar {
	private LinkedList<Simbolo> conjuntoSimboloTerminal;
	private LinkedList<Simbolo> conjuntoSimboloNonTerminal;
	private LinkedList<Corpo> conjuntoProducoes;
	private LinkedList<Cabeca> conjuntoCabeca;
	private Simbolo simboloInicial;
	
	public Grammar() {
		this.conjuntoSimboloTerminal = new LinkedList<>();
		this.conjuntoSimboloNonTerminal = new LinkedList<>();
		this.conjuntoProducoes = new LinkedList<>();
		this.conjuntoCabeca = new LinkedList<>();
	}
	
	public void atribuiProducao(List<String> linhas) {
		String[] linha;
		for (Iterator<String> iterator = linhas.iterator(); iterator.hasNext();) {
			linha = linhas.remove(0).split(" ");
			Cabeca cabeca = new Cabeca(new Simbolo(linha[0].charAt(0)));
			if(!conjuntoCabeca.contains(cabeca)) {
				cabeca.addProducao(new Corpo(linha[1]));
				conjuntoCabeca.add(cabeca);
			} else {
				int indice = conjuntoCabeca.indexOf(cabeca);
				conjuntoCabeca.get(indice).addProducao(new Corpo(linha[1]));
			}
		}
	}
	
	public LinkedList<Corpo> getConjuntoProducoes() {
		return conjuntoProducoes;
	}
	public void setConjuntoProducoes(LinkedList<Corpo> conjuntoProducoes) {
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

	public LinkedList<Cabeca> getConjuntoCabeca() {
		return conjuntoCabeca;
	}

	public void setConjuntoCabeca(LinkedList<Cabeca> conjuntoCabeca) {
		this.conjuntoCabeca = conjuntoCabeca;
	}

	public boolean validarPalavra(String next) {
		// TODO Auto-generated method stub
		return false;
	}

	public Simbolo getSimboloInicial() {
		return simboloInicial;
	}

	public void setSimboloInicial(Simbolo simboloInicial) {
		this.simboloInicial = simboloInicial;
	}
	
	

}
