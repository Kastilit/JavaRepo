package exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Tech1 {
    public static void main(String[] args) {
        System.out.println("Hellow");
        System.out.println(LocalDateTime.now());
        int hour = LocalDateTime.now().getHour();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
 //       System.out.println("Good morning" + name);

        if (hour >5 && hour <12) {
            System.out.println("Good morning " + name);
        }
    }
}