package exercicios;

import java.util.*;

public class Prova_Java {


		
	
	int numConta,senha,mes;
	
	double saldo=1000,sacar,deposito,rendimento;
	
	String data,agencia;



	
	
	
	public void saldo() {
		
		
		System.out.println("seu saldo é de:" + saldo + "R$");
		
	}



	public void saque() {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("quanto gostaria de sacar");
		sacar=in.nextDouble();
		if(sacar>saldo) {
			
			
			System.out.println("valor invalido");
		}else {
	      saldo=saldo-sacar;

	      System.out.println("seu saldo agora é :" + saldo +"R$ ");
		}
	}








	public void deposito() {

		
		Scanner in=new Scanner(System.in);
		
		System.out.println("quanto gostaria de depositar");
		deposito=in.nextDouble();
		
	      saldo=saldo+deposito;

	      System.out.println("seu saldo agora é :" + saldo +"R$ ");
		
	}








	public void calcular() {
		
		Scanner in=new Scanner(System.in);
		
		  System.out.println("quantos meses gostaria de deixar seu saldo render");
		 mes=in.nextInt();
		  
		  
		saldo=saldo+ saldo*(4.52/100)*mes;
		
		
		  System.out.println("no final destes meses você tera \n" + saldo + " R$" );
		
	}
	
	



}