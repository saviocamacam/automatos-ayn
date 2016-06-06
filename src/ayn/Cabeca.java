package ayn;

import java.util.LinkedList;

public class Cabeca {
	private Simbolo simboloOrigem;
	private LinkedList<Corpo> conjuntoDerivacoes;
	
	public Cabeca(Simbolo simboloOrigem) {
		this.simboloOrigem = simboloOrigem;
	}
	public LinkedList<Corpo> getConjuntoDerivacoes() {
		return conjuntoDerivacoes;
	}
	public void setConjuntoDerivacoes(LinkedList<Corpo> conjuntoDerivacoes) {
		this.conjuntoDerivacoes = conjuntoDerivacoes;
	}
	public Simbolo getSimboloOrigem() {
		return simboloOrigem;
	}
	public void setSimboloOrigem(Simbolo simboloOrigem) {
		this.simboloOrigem = simboloOrigem;
	}
	public void addProducao(Corpo producao) {
		conjuntoDerivacoes.add(producao);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.simboloOrigem.getSimbolo().equals(((Cabeca) o).getSimboloOrigem().getSimbolo());
	}

}
