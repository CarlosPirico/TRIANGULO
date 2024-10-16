package models;

public class FuncoesUteis {
	
	// metodo simples de soma.
	public static int soma(int x, int y){
		return x + y;
	}
	
	// metodo de triangulo de acordo com a altura dezejada.
	public static String triangulo(int altura) {
		// instanciando o resultado vazio.
		String result = "";
		// realizando um for para realizaro preenchimento de cada linha.
		for (int i = 0;altura >= i ; i++) {
			// outro for para saber quando "X" irá ficar dentro daquela linha.
			for (int x = 0; i >= x ; x++) {
				// preenchendo "X" quantas vezes sejam necessaria de acordo com o "i".
				result += "X ";
			}
			// pulando linha
			result += "\n";
		}
		return result;
	}
	
	public static String printArquivo(String arquivo) {
		// retornando o texto do paramentro arquivo.
		return arquivo;
	}

}
