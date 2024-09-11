package targetTesteEx1;
import java.util.Scanner;

	public class VerificaLetraA {

		   public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		                System.out.print("Informe uma letra: ");
		        String input = scanner.nextLine();

		        
		        int quantidade = contarOcorrenciasDeA(input);

		        
		        if (quantidade > 0) {
		            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + quantidade + " vezes na string.");
		        } else {
		            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
		        }

		        scanner.close();
		    }

		      public static int contarOcorrenciasDeA(String input) {
		        int count = 0;

		        
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);

		                if (c == 'a' || c == 'A') {
		                count++;
		            }
		        }

		        return count;
		    }

	}

