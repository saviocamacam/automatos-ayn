package ayn;

import java.util.LinkedList;

public class Corpo {
	public LinkedList<Simbolo> corpo;
	
	public Corpo(String linha) {
		this.corpo = new LinkedList<>();
		inicializaCorpo(linha);
	}

	private void inicializaCorpo(String linha) {		
		for(char c : linha.toCharArray()) {
			if(Character.isUpperCase(c)) {
				Simbolo simbolo = new Simbolo();
				simbolo.setTipo(TipoSimbolo.NonTERMINAL);
				corpo.add(simbolo);
			} else {
				Simbolo simbolo = new Simbolo();
				simbolo.setTipo(TipoSimbolo.TERMINAL);
				corpo.add(simbolo);
			}
		}
	}
}
