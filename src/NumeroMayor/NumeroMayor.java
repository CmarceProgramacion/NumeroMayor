package NumeroMayor;
import java.util.Scanner;

public class NumeroMayor {
	Scanner entrada=new Scanner(System.in);


	 public int[] ingresarValores(int tamano){
	  int tamanoNumero=tamano;	
	  int[]numeros=new int[tamanoNumero];

	  for(int i=0; i<numeros.length; i++){
	   System.out.println("Ingrese el valor N° "+(i+1));
	   numeros[i]=entrada.nextInt();  
	  }
	 return numeros;
	 }

	 
	  public void MostrarNumeros(int lista[]){
	  System.out.println("Numeros a Evaluar");
	  for(int i=0; i<lista.length; i++){
	   System.out.print(lista[i]+" ");
	   }
	  }


	 public int buscarNumeroMayor(int lista []){
	 int numeroMayor=0;
	 for(int i=0; i<lista.length; i++){
	  if(numeroMayor<lista[i]){
	   numeroMayor=lista[i];
	   } 
	 }
	 return numeroMayor;
	 }

}
