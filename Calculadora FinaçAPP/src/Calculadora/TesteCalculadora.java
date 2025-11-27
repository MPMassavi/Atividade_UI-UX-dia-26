package Calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 * <p>Esta classe testa operações matemáticas básicas da classe {@link Calculadora}
 * como soma, subtração, multiplicação e divisão, exbindo os seus resultados no console</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 * 		<li>Técnicas de revisão estática (caixa branca)</li>
 * 		<li>Técnicas de revisão (caixa branca)</li>
 * 		<li>Aplicação de refatoração em código java</li>
 * 		<li>Documentação com Javadoc</li>
 * 
 * <ul>
 *  <p>Ápos a refatoração, os métodos desta classe são <strong>métodos puros </strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.<p>
 * 
 * @author Matheus Pereira Massavi
 * @version 1.0
 */

public class TesteCalculadora {

	/**
	 * <p>testa e exibe o resultado dos testes da função calcular na classe {@link Calculadora}
	 * no console</p>
	 * 
	 *<p>Operadores testados:</p>
	 * <ul>
	 * 		<li>"+":Soma</li>
	 * 		<li>"-":Subtração</li>
	 * 		<li>"*":Multiplicação</li>
	 * 		<li>"/":Divisão</li>
	 * </ul> 
	 * 
	 * <p>Possiveis pontos de erros testados:.</p>
	 * <ul>
	 * 		<li>divisão por zero</li>
	 * 		<li>Operador invalido</li>
	 * </ul> 
	 */
	
	public static void main(String[] args) {
		
		/**
		 * <p>Instancia a classe {@link Calculadora} como calc </p>
		 */
		
		Calculadora calc = new Calculadora();
		
		/**
		 * <p>testa cada operação da função cal e exibe seu resultado no console</p>
		 */
		
		System.out.println(calc.calcular(2,3,"+"));//esperado: 5
		System.out.println(calc.calcular(10,4,"-"));//esperado: 6
		System.out.println(calc.calcular(3,5,"*"));//esperado: 15
		System.out.println(calc.calcular(8,2,"/"));//esperado: 4
		
		/**
		 * <p>Tenta fazer a divisão por zero, caso de um erro, exibe a mensagem de erro </p>
		 */
		
		try {
			System.out.println(calc.calcular(8,0,"/"));//exceção
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		/**
		 * <p>Tenta fazer uma operação com uma string de operador diferente, caso de um erro, 
		 * exibe a mensagem de erro </p>
		 */
		
		try {
			System.out.println(calc.calcular(5,5,"x"));//exceção
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
