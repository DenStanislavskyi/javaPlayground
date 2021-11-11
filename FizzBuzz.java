
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
      
        for (int i = 1; i <= number; i++){
          
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.print("FizzBuzz ");
            else if (i % 3 == 0)
                System.out.print("Fizz ");
            else if (i % 5 == 0)
                System.out.print("Buzz ");
            else System.out.print(i + " ");
        }
    }
}
