/*
 * Author: Muhammed Abushamma
 * Date: 8/1/24
 * File: PI.java
 * Description: Generates PI up to user-defined number of decimal places. Keeps a limit to how far the program will go.
 */

 import java.util.Scanner;

public class PI {
  
    /**
     * Gets user input. Puts number into int variable PI_Places. 
     * @return PI_Places - The number of decimal places PI will be generated to
     */
  public static int getUserInput(){
    System.out.print("Enter the amount of decimal places PI will be generated to: ");
    Scanner scanner = new Scanner(System.in);

    //TODO: handle the case where the user inputs a String or non-int
    int PI_Places = scanner.nextInt();
    return PI_Places;
  }

  /**
   * Validates user input. 
   * @param PI_Places
   * @return
   */
  public static boolean validateUserInput(int PI_Places){
    if (PI_Places > 15){
        System.out.println("Cannot exceed 15 decimal places. Try again.");
        return false;
    } else{
        return true;
    }
  }

  /**
   * Formats PI to number of decimal places defined by the user. 
   * @param PI_Places
   */
  public static void generatePI(int PI_Places){
    System.out.printf("%." + PI_Places + "f", Math.PI); 
  }

  /**
   * main method
   * @param args
   */
  public static void main(String[] args) {
    int PI_Places = getUserInput();
    while (validateUserInput(PI_Places) == false){
        PI_Places = getUserInput();
    }
    generatePI(PI_Places);
  }
}
