package app;
import models.*;

public class Main {

	public static void main(String[] args) {
	
		// chamando o metodo soma triangulo e printArquivo e retornando os seus resultados.
		System.out.println(FuncoesUteis.soma(5,4) + "\n");
		System.out.println(FuncoesUteis.triangulo(5) + "\n");
		System.out.println(FuncoesUteis.printArquivo("texto teste") + "\n");

	}

}
