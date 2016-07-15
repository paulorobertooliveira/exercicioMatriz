package br.edu.ufam.icom;
import java.util.Random;


public class Matriz {
	//MÉTODO VERDADEIRO OU FALSO 
	public static boolean retornaBooleano(int[][] mat, int i, int j, int numero){
		boolean existe = false;
		
		//percorre a matriz
		for (int i2 = 0; i2 < i ; i2++) {
			for (int j2 = 0; j2 < j; j2++) {
				if (mat[i2][j2] == numero) {
					existe = true;
				}
			}
		}
		
		return existe;
	}
	
	//mMÉTODO MOSTRA MATRIZ 
	public static void imprime(int[][] mat, int i, int j){
		//mostra os valores
				for (int i2 = 0; i2< 5; i2++) {
					
					System.out.print(" | ");
					for (int j2 = 0; j2 < 5; j2++) {
						if (mat[i2][j2] < 10) {
							System.out.print("0");
						}
						System.out.print(mat[i2][j2]+" | ");
					}
					System.out.println("\n");
				}
	}
	
	
	//MÉTODO PRINCIPAL
	public static void main(String[] args) {
		
		
		Random gerador = new Random();
		
		
		int matriz[][] = new int[5][5];
		
		
		//recebe valores
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = gerador.nextInt(11);
			}
		}
		
		imprime(matriz, 5 , 5);
		
		
		System.out.println("\n");
		
		//VER SE O NUMERO EXISTE NA MATRIZ
		boolean resposta;
		resposta = retornaBooleano(matriz, 5, 5, 10);
		
		if (resposta) {
			System.out.println("O numero 10 existe na matriz!!");
		} else { 
			System.out.println("O numero 10 não existe na matriz!!!!");
		}
		
	}

}
