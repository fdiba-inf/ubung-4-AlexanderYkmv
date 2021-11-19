package exercise4;

import java.util.Scanner;

public class MinIndex {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    double[] array = new double[size];

    for(int i = 0; i < array.length; i++) {
      array[i] = input.nextDouble();
    }

    double min = array[0];
    for(int i = 1; i < array.length; i++) {
      if(array[i] < min) {
        min = array[i];
      }
    }
    System.out.println("Min index: " + min);
  }
}