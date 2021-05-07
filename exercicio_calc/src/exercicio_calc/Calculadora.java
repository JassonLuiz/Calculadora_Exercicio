package exercicio_calc;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a opera��o que voc� deseja fazer (+, -, *, /, raiz, potencia, impar ou par, divisivel: ");
		char op = sc.next().charAt(0);
		
		double num1, num2, result;
		
		
		switch(op) {
		case '+':
			System.out.println("Informe o primeiro n�mero:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo n�mero:");
		    num2 = sc.nextDouble();
		    result = num1 + num2;
		    System.out.printf("A soma �: %.2f%n", result);
		    break;
		case '-':
			System.out.println("Informe o primeiro n�mero:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo n�mero:");
		    num2 = sc.nextDouble();
		    result = num1 - num2;
		    System.out.printf("A soma �: %.2f%n", result);
		    break;
		case '*':
			System.out.println("Informe o primeiro n�mero:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo n�mero:");
		    num2 = sc.nextDouble();
		    result = num1 * num2;
		    System.out.printf("A multiplica��o �: %.2f%n", result);
		    break;
		case '/':
			System.out.println("Informe o primeiro n�mero:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo n�mero:");
		    num2 = sc.nextDouble();
		    result = num1 / num2;
		    System.out.printf("A divis�o �: %.2f%n", result);
			break;
		case 'R':
		    System.out.println("Informe um n�mero para saber sua raiz quadrada: ");
		    num1 = (int) sc.nextDouble();
		    result = Math.sqrt(num1);
		    System.out.printf("A raiz quadrada de " + num1 + " �: %.2f",result);
		    break;
		case 'I':
			System.out.println("Informe um n�mero inteiro para saber se � impar ou par: ");
			num1 = (int) sc.nextDouble();
			if(num1 % 2 == 0) {
				System.out.println(num1 + " � par!");
			}
			else {
			    System.out.println(num1 + " � impar!");
			}
			break;
		case 'P':
			System.out.println("Informe um n�mero base: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o expoente: ");
			num2 = sc.nextDouble();
			result = Math.pow(num1, num2);
			System.out.printf("O resultado �: %.2f%n", result);
			break;
		case 'D':
			System.out.println("Informe um n�mero inteiro para saber se ele � divisivel por 3: ");
			num1 = (int) sc.nextDouble();
			
			if(num1 % 3 == 0) {
				System.out.println("SIM, � DIVISIVEL!");
			}
			else {
				System.out.println("N�O, n�o � DIVISIVEL!");
			}
		
			break;
			default: 
				System.out.println("Informe uma oprea��o de acordo com as quais foram citadas!");
				break;
		}
		
		
		
		
		sc.close();
	}

}

