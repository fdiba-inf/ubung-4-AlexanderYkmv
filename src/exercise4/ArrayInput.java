package exercise4; 

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter array length: ");

    int size = input.nextInt();
    int[] array = new int[size];

    for(int a : array) {
      System.out.print("Enter array value: ");

      array[a] = input.nextInt();
    }
    String numbers = Arrays.toString(array);
    System.out.println("Numbers: " + numbers);
  }
}