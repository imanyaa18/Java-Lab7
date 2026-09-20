package exercise3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueHeights {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<Integer> heights = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height " + (i + 1) + ": ");
            int height = input.nextInt();
            heights.add(height);
        }

        System.out.println("\nUnique heights using HashSet:");

        for (Integer height : heights) {
            System.out.println(height);
        }

        Set<Integer> sortedHeights = new TreeSet<>(heights);

        System.out.println("\nUnique heights in ascending order:");

        for (Integer height : sortedHeights) {
            System.out.println(height);
        }
    }
}
