package ayn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	public Arquivo() {

	}
	
	public static Grammar lerArquivoGM(String nomeArquivo) {
		Grammar grammar = new Grammar();
		List<String> linhas = new ArrayList<>();
		
		try {
			linhas = Files.readAllLines(Paths.get(nomeArquivo+".txt", ""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] linha = linhas.remove(0).split(" ");
		grammar.setConjuntoSimboloTerminal(linha);
		
		linha = linhas.remove(0).split(" ");
		grammar.setConjuntoSimboloNonTerminal(linha);
		
		linha = linhas.remove(0).split(" ");
		grammar.setSimboloInicial(new Simbolo(linha[0].charAt(0)));
		
		grammar.atribuiProducao(linhas);
		
		
		return grammar;
	}

}
