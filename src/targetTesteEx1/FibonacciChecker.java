package targetTesteEx1;
import java.util.Scanner;

public class FibonacciChecker {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Informe um número: ");

		        int numero = scanner.nextInt();

		        if (isFibonacci(numero)) {
		            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		        } else {
		            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
		        }

		        scanner.close();
		    }

		    public static boolean isFibonacci(int numero) {
		             int a = 0;
		        int b = 1;

		               if (numero == a || numero == b) {
		            return true;
		        }

		        int c = a + b;
		        
		        while (c <= numero) {
		            if (c == numero) {
		              return true; 
		            }
		            a = b;
		            b = c;
		            c = a + b;
		        }
		        return false;
		    }

	}

