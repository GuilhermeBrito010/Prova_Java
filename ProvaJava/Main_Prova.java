package exercicios;

import java.util.Scanner;

public class Main_Prova {
	
	
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	
	Prova_Java prova =new Prova_Java();
	String nome;
	int opcao;
    int continuar;
	
	
	System.out.println("olá bem vindo qual seu nome ");
	nome=in.nextLine();
	
	System.out.println("olá"+ nome + "o que deseja fazer hoje");
     
	
	

	do {
	System.out.println("{1} mostrar saldo \n{2} fazer deposito \n{3} realizar saque \n{4} calcular rendimento ");
	opcao=in.nextInt();
	
	if(opcao<1 || opcao>4) {
		
		
		System.out.println("escolha uma opcao valida");

	}
	
	
	else if(opcao==1) {
		
		prova.saldo();
	}
	
	else if(opcao==2) {
		
		prova.deposito();
	}
	else if(opcao==3) {
		
		prova.saque();
	}
	else if(opcao==4){
		
		prova.calcular();
	}
	
	
	
	System.out.println("continuar? \n{1} sim \n{2}não");
	 continuar =in.nextInt();
	
	if(continuar<1 || continuar>2) {
		
		System.out.println("erro");
	}else if(continuar==2){
		
		System.out.println(nome +" " +"obrigado pela preferencia ");
	}
	
	}while(continuar==1);
	
}
	
	
	
}
