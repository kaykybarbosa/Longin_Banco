package Kayky;

import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
						
				String nome = "Kayky";
				int agencia = 1234;
				int conta = 54321;
				int saldo = 0;
				int senha = 4444;
						
				int Ag , C, S, opcao = 0, R = 0;
						
				Scanner scanner = new Scanner(System.in);
				
				while (R != 2) {
				System.out.println("----------------------");
				System.out.println("  LONGIN DE USUÁRIO ");
				System.out.println("----------------------");
						
				System.out.println("Agêcia: : ");
				Ag = scanner.nextInt();
				System.out.println("Conta: ");
				C = scanner.nextInt();
				System.out.println("Senha: ");
				S = scanner.nextInt();
						
				if(agencia == Ag && conta == C && senha == S) {
						System.out.println();
		     			System.out.println("Bem - vindo, " + nome + "!");
		     			System.out.println();
		     			break;
				}else {
						System.out.println("DADOS INCORRETOS");
						System.out.println("1 - Tentar Novamente\n2 - Sair");
						R = scanner.nextInt();
			    	}
				}
				while(opcao != 4) {
		
					mostrarOpcoes();
					opcao = scanner.nextInt();
					
					switch(opcao){
					case 1:
							System.out.println("Seu saldo é: R$" + saldo);
						break;
					case 2:
							System.out.printf("Qual valor? R$");
							int saque = scanner.nextInt();
								 
							if( saldo - saque < 0) {
								System.out.println("VALOR INSUFICIENTE PARA O SAQUE.");
							}else {
								saldo = saldo - saque;
								System.out.println("SAQUE EFETUADO COM SUCESSO! ");
				}
						break;	
					case 3:
							System.out.printf("Qual valor? R$");
			 				int depositar = scanner.nextInt();
			 				saldo = depositar + saldo;
			 				System.out.println("DEPÓSITO EFETUADO COM SECESSO! ");
			 			break;	
					case 4:
							System.out.println("Saindo..");
							System.exit(0);
										
				 }
					for(int limpar = 0; limpar <=1; limpar++) {
						System.out.println();
					}
		    	}
			   scanner.close();
			}		
	
				public static void mostrarOpcoes() {
					System.out.println("---------------");
					System.out.println("[1] VER SALDO");
					System.out.println("[2] SAQUE");
					System.out.println("[3] DEPOSITAR");
					System.out.println("[4] SAIR");
					System.out.println("---------------");

			 }			 
	}



