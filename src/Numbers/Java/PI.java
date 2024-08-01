// Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places. Keep a limit to how far the program will go.

import java.util.Scanner;

public class PI {
  
  public int getUserResponse(){
    Scanner scanner = new Scanner(Systemn.in);
    int PI_Digits = scanner.nextInt();
    return PI_Digits;
  }

  public void generatePI(int PI_Digits){
    System.out.printf("% + PI
