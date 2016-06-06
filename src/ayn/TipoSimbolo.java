package ayn;

public enum TipoSimbolo {
	TERMINAL("Terminal"),
	NonTERMINAL("Nao Terminal");
	
	String nomeTipo;
	TipoSimbolo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
}
