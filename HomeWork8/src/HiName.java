import java.util.Scanner;

public class HiName {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем имя пользователя
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();

        // Выводим приветствие в одну строку
        System.out.println("Привет, " + userName);

        // Закрываем Scanner (хорошая практика)
        scanner.close();
    }
}