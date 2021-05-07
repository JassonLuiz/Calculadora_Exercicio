package exercicio_calc;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a operação que você deseja fazer (+, -, *, /, raiz, potencia, impar ou par, divisivel: ");
		char op = sc.next().charAt(0);
		
		double num1, num2, result;
		
		
		switch(op) {
		case '+':
			System.out.println("Informe o primeiro número:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo número:");
		    num2 = sc.nextDouble();
		    result = num1 + num2;
		    System.out.printf("A soma é: %.2f%n", result);
		    break;
		case '-':
			System.out.println("Informe o primeiro número:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo número:");
		    num2 = sc.nextDouble();
		    result = num1 - num2;
		    System.out.printf("A soma é: %.2f%n", result);
		    break;
		case '*':
			System.out.println("Informe o primeiro número:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo número:");
		    num2 = sc.nextDouble();
		    result = num1 * num2;
		    System.out.printf("A multiplicação é: %.2f%n", result);
		    break;
		case '/':
			System.out.println("Informe o primeiro número:");
		    num1 = sc.nextDouble();
		    System.out.println("Informe o segundo número:");
		    num2 = sc.nextDouble();
		    result = num1 / num2;
		    System.out.printf("A divisão é: %.2f%n", result);
			break;
		case 'R':
		    System.out.println("Informe um número para saber sua raiz quadrada: ");
		    num1 = (int) sc.nextDouble();
		    result = Math.sqrt(num1);
		    System.out.printf("A raiz quadrada de " + num1 + " é: %.2f",result);
		    break;
		case 'I':
			System.out.println("Informe um número inteiro para saber se é impar ou par: ");
			num1 = (int) sc.nextDouble();
			if(num1 % 2 == 0) {
				System.out.println(num1 + " é par!");
			}
			else {
			    System.out.println(num1 + " é impar!");
			}
			break;
		case 'P':
			System.out.println("Informe um número base: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o expoente: ");
			num2 = sc.nextDouble();
			result = Math.pow(num1, num2);
			System.out.printf("O resultado é: %.2f%n", result);
			break;
		case 'D':
			System.out.println("Informe um número inteiro para saber se ele é divisivel por 3: ");
			num1 = (int) sc.nextDouble();
			
			if(num1 % 3 == 0) {
				System.out.println("SIM, é DIVISIVEL!");
			}
			else {
				System.out.println("NÃO, não é DIVISIVEL!");
			}
		
			break;
			default: 
				System.out.println("Informe uma opreação de acordo com as quais foram citadas!");
				break;
		}
		
		
		
		
		sc.close();
	}

}

