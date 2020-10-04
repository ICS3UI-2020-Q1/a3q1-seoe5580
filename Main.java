import java.util.Scanner;
/**
 * This program will find you the maximum integer out of 3 integers
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  // Creates a input for the scanner
  Scanner input = new Scanner(System.in);
  
  // Asks for the integer
  System.out.println("Please enter three integers on separate lines");
  
  // Gets the number from the user
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();

  // determine which integer is the biggest integer out of 3
  if(num1 >= num2 && num1 >= num3){
    // tells the user the maximum integer
    System.out.println("Maximum: " + num1);
  }else if(num2 >= num1 && num2 >= num3){
    // tells the user the maximum integer
    System.out.println("Maximum: " + num2);
  }else if(num3 >= num1 && num3 >= num2){
    // tells the user the maximum integer
    System.out.println("Maximum: " + num3);
  }

  }
}
