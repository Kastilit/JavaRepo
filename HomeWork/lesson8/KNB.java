import java.util.Scanner;

public class KNB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выбор Васи (0 - камень, 1 - ножницы, 2 - бумага):");
        int vasyaChoice = scanner.nextInt();

        System.out.println("Введите выбор Пети (0 - камень, 1 - ножницы, 2 - бумага):");
        int petyaChoice = scanner.nextInt();

        if (vasyaChoice < 0 || vasyaChoice > 2 || petyaChoice < 0 || petyaChoice > 2) {
            System.out.println("Ошибка: введите 0, 1 или 2");
            return;
        }

        // Определяем победителя
        if (vasyaChoice == petyaChoice) {
            System.out.println("Ничья!");
        } else if ((vasyaChoice == 0 && petyaChoice == 1) ||
                (vasyaChoice == 1 && petyaChoice == 2) ||
                (vasyaChoice == 2 && petyaChoice == 0)) {
            System.out.println("Вася победил!");
        } else {
            System.out.println("Петя победил!");
        }
    }
}