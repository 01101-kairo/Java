// package AleatorioNumero;
// numeros aleatorios

import java.util.Random;
public class AleatorioNumero{
public static void main(String[] args) {
		Random aleatorio = new Random();
		//gera os numeros inteiros
		int valor = aleatorio.nextInt(32);
		//exibe os numeros aleatorios
		System.out.println("numero gerado: "+valor);
	} 
}
