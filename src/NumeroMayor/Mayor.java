package NumeroMayor;

import java.util.Scanner;

public class Mayor {
	public static void main(String args[])
	 {
	 
	  int tamano, copiaNumeroMayor; 
	 
	  Scanner entrada=new Scanner(System.in);
	  NumeroMayor valores=new NumeroMayor();
	 
	 
	  System.out.println("Cantidad de datos a evaluar");
	  tamano=entrada.nextInt();
	  
	  int [] numeros=new int[tamano];
	 
	  numeros=valores.ingresarValores(tamano);
	  valores.MostrarNumeros(numeros);
	   copiaNumeroMayor=valores.buscarNumeroMayor(numeros); 
	   System.out.println("");
	   System.out.println("El numero mayor es: "+copiaNumeroMayor);
	 }
}
