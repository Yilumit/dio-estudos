package view;

import java.util.Scanner;

import controller.ContarController;
import controller.ParametrosInvalidosException;
/**
 * 	<h1>Contador</h1>Classe que captura parametros via terminal para serem validados na casse <b>ContarController</b>
 * 
 * @author Vinicius Barbosa
 * 
 *  
 */
public class Contador {

	public static void main(String[] args) {
		ContarController conta = new ContarController(); 
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			conta.contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		terminal.close();
	}

}
