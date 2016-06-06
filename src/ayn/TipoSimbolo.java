package ayn;

public enum TipoSimbolo {
	TERMINAL("Terminal"),
	NonTERMINAl("Nao Terminal");
	
	String nomeTipo;
	TipoSimbolo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
}
