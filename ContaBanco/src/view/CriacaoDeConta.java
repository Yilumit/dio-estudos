package view;

import java.util.Scanner;

import controller.ContaTerminal;

public class CriacaoDeConta {

	public static void main(String[] args) {
		//Instanciando o objeto ContaTerminal na classe main
		ContaTerminal conta = new ContaTerminal();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Criacao de conta bancaria\n");
		
		//Inserção dos dados bancarios
		System.out.println("Insira o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Insira o seu sobrenome: ");
		String sobrenome = scanner.next();
		
		conta.nomeCliente = nome +" "+ sobrenome;
		
		System.out.println("Insira o numero da sua agencia (formato: xxx-x): ");
		conta.agencia = scanner.next()	;
		
		System.out.println("Insira o numero da conta: ");
		conta.numero = scanner.nextInt();
		
		System.out.println("Saldo que deseja adicionar na conta: ");
		conta.saldo = scanner.nextDouble();
		scanner.close();
		
		//Mensagem de conclusao
		System.out.println("Olá "+conta.nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numero+" e seu saldo de "+conta.saldo+" já está disponível para saque.");
		
	}

}
