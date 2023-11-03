package ED11;

import java.util.Scanner;

public class ConversorMetrico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//Iniciamos el scanner	
		
		//Declaro variable numero real metros
		double metros;
		
		//De esta forma los datos que introduzcamos se guardaran en la variable metros e imprimimos en pantalla cuantos metros vamos a convertir.
		System.out.println("Introduce metros a convertir");

		metros= sc.nextDouble(); 
		
		// Declaro variable centimetros convirtiendo metros a centimetros
		double centimetros=metros*100;
		
		
		//Declaro variable kilometros convirtiendo metros a kilometros
		double kilometros=metros/1000;
		
		//Imprimimos el resultado en pantalla

		System.out.println(metros + " metros son "+ centimetros +" centimetros o "+ kilometros + " kilometros");
	}

}
