package exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        if(numbers.isEmpty()){
            System.out.println("The array list is empty.");
        }

        Scanner input = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            int number = input.nextInt();
            numbers.add(number);
        }

        int total = 0;

        for (int i = 0; i< numbers.size(); i++){
            total = total + numbers.get(i);
        }
         System.out.println("\nThe numbers are: ");

        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("Total = " + total);
    }
}
