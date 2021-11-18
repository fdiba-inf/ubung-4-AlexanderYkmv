package exercise4;

import java.util.Scanner;

public class ArrayOutput {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    


    int size = input.nextInt();
    int[] array = new int[size];
    for(int i = 0; i < array.length; i++) {
      array[i] = input.nextInt(); 
    }
    for(int index = 0; index < array.length; index++) {
      for(int j = 0; j < array.length; j++) {
        System.out.print(" ");
      }
     System.out.print(array[index]);
    }


  }
}