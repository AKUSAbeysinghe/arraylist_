import com.sun.org.apache.xpath.internal.objects.XNumber;



import java.util.ArrayList;
import java.util.Scanner;

public class InputAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter Numbers: (Enter -1 to finish)");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1)
                break; // Exit the loop when -1 is entered
            arrayList.add(number);
        }

        System.out.println("Entered numbers:");

        for (int number : arrayList) {
            System.out.println(number);
        }

        // Removing odd numbers
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arrayList) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        System.out.println("Numbers after removing odd numbers:");

        for (int number : evenList) {
            System.out.println(number);
        }



        // Searching for a number
        System.out.println("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        int index = -1; // Initialize index to -1 (indicating not found)
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == searchNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(searchNumber + " found at index: " + index);
        } else {
            System.out.println(searchNumber + " not found in the list.");
        }


        int total = 0;
        for (int number : arrayList) {
            System.out.println(number);
            total += number;
        }

        double average = (double) total / arrayList.size();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

