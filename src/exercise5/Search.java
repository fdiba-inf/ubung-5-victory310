package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        // 4 3 6 7 -> 3
        // 0 1 2 3
        int numberIndex = -1;
        for (int index = 0; index < numbers.length; index++) {
          if (number == numbers [index]) {
            numberIndex = index;
            break;
          }
        }
        System.out.println("Number index: " + numberIndex);
    }
}
