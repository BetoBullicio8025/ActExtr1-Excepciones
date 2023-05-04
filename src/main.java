import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hola mundooo");
        Scanner scanner = new Scanner(System.in);


         try {
             int a = 10;
             int b = Integer.parseInt(scanner.nextLine());
             System.out.println("Division=  " + (a / b));
         }
         catch (ArithmeticException e) {
             System.out.println("No se puede dividir entre 0");
         }
         catch (NumberFormatException numberFormatException) {
             System.out.println("!Solo puedes usar numeros enteros¡");
         }
         finally {
             System.out.println("Siempre se va a ejecutar...");
         }

        System.out.println("\nFin del programa...");
         }
    }

