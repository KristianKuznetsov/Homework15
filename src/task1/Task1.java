package task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void build(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите набор чисел, разделенных запятыми:");
        String input = scanner.nextLine();

        String[] numbers = input.split(", ");
        Set<String> uniqueNumbers = new HashSet<>();
        for (String number : numbers) {
            uniqueNumbers.add(number);
        }

        // Выводим результат на экран
        System.out.println("Результат:");
        for (String uniqueNumber : uniqueNumbers) {
            System.out.print(uniqueNumber + ", ");
        }
        System.out.println("\n");
    }
}
