package exercise4;

import java.util.Scanner;
 public class ArrayReversal {
   public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     int size = input.nextInt();
     char[] array = new char[size];

     for(int i = 0; i < array.length; i++) {
       array[i] = input.next().charAt(0); 
     }

     System.out.print("Reversed symbols: [ ");
     for (int i= array.length - 1; i >= 0; i--) {
       System.out.print(array[i]);
       if (i != 0) {
         System.out.print(", ");
       }
     }
     System.out.print("] ");
   }
 }