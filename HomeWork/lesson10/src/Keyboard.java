import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву английского алфавита: ");
        char inputChar = scanner.next().charAt(0);

        if (inputChar < 'a' || inputChar > 'z') {
            System.out.println("Ошибка: введите маленькую букву английского алфавита");
            return;
        }

        String keyboard = "qwertyuiopasdfghjklzxcvbnm";

        int index = keyboard.indexOf(inputChar);

        int leftIndex = (index - 1 + keyboard.length()) % keyboard.length();
        char leftChar = keyboard.charAt(leftIndex);

        System.out.println("Слева от '" + inputChar + "' находится буква '" + leftChar + "'");
    }
}