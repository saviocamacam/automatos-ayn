package ayn;

public class Simbolo {
	private char simbolo;
	private TipoSimbolo tipo;
	
	public Simbolo() {
		
	}
	
	public Simbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public TipoSimbolo getTipo() {
		return tipo;
	}

	public void setTipo(TipoSimbolo tipo) {
		this.tipo = tipo;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}
}