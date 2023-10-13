package controller;
/**
 * 	<h1>ContarController</h1> Contem um unico metodo que recebe parametros para valida-los
 *	
 */
public class ContarController {
	/**
	 * Faz a impressao dos numeros passados como parametros <b>n</b> vezes, onde <b>n</b> e a subtracao de <b>parametroDois</b> por <b>parametroUm</b>
	 *  
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 */
	public void contar(int parametroUm, int parametroDois	) throws ParametrosInvalidosException{
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			int interacao = parametroDois - parametroUm;
			for (int i = 0; i <= interacao; i++) {
				System.out.println("Imprimindo o número "+ parametroUm);
				System.out.println("Imprimindo o número "+ parametroDois);
				System.out.println("*************************");
			}
		}
	}
}
