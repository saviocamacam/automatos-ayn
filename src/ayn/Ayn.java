package ayn;

import java.util.Scanner;

public class Ayn {

	static int op = 0;
	static Scanner scanner;
	static String nomeArquivo;
	static String palavra;
	
	public Ayn() {
		
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		do{
			System.out.println("-- Informar arquivo");
			//nomeArquivo = scanner.next();
			do{
				Grammar grammar = Arquivo.lerArquivoGM(scanner.next());
				System.out.println("(1) Informar novo arquivo\n(2) Testar palavra");
				op = scanner.nextInt();
				if(op == 1) {
					break;
				}
				
				if(op == 2) {
					System.out.println("-- Informe palavra a ser testada: ");
					if(grammar.validarPalavra(scanner.next())){
						System.out.println("Palavra aceita");
					} else{
						System.out.println("Palavra não aceita");
					}
				}
			}while(scanner.nextInt() != 3);
		}while(scanner.nextInt() != 1);
	}

}
