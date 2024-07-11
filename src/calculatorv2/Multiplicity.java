package calculatorv2;

import java.util.Scanner;

public class Multiplicity {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the desired number: ");
    int number = scanner.nextInt();
    int result;

    for (int i = 0; i < 10; i++) {
      result = number * i;
      System.out.println("The result of " + number + " * " + i + " is: " + result);
    }
    
    scanner.close();
  }
}

