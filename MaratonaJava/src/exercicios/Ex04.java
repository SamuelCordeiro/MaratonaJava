package exercicios;

public class Ex04 {

	public static void main(String[] args) {
		
		/*Desenvolva um programa que:
		 * Leia 4 (quatro) numeros
		 * Calcule o quadrado para cada um
		 * Somem todos 
		 * Mostre o resultado*/
		
		double soma = 0; 
		
		for(int i = 0; i < 4; i++) {
			Utils.print("Digite um numero:");
			soma = soma + Math.pow(Utils.readDouble(), 2);
		}
		
		Utils.print("O resultado é: " + soma); 
	}

}
