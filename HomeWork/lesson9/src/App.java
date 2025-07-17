import java.util.Random;
import java.util.Scanner;

// Класс App для тестирования
public class App {
    public static void main(String[] args) {
        // Создаем телевизоры
        Television tv1 = new Television("Samsung", 55, true);
        Television tv2 = new Television("LG", 42, false);

        // Работа с первым телевизором
        tv1.powerOn();
        tv1.changeChannel(5);
        tv1.volumeUp();
        tv1.volumeUp();
        System.out.println(tv1);

        // Работа со вторым телевизором
        tv2.powerOn();
        tv2.changeChannel(3);
        System.out.println(tv2);
        tv2.powerOff();

        // Дополнительно: создание телевизора с параметрами с клавиатуры
        Television tv3 = createTelevisionFromInput();
        System.out.println("Создан новый телевизор: " + tv3);

        // Дополнительно: создание телевизора со случайными параметрами
        Television tv4 = createRandomTelevision();
        System.out.println("Создан телевизор со случайными параметрами: " + tv4);
    }

    // Метод для создания телевизора с параметрами с клавиатуры
    private static Television createTelevisionFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nСоздание нового телевизора:");
        System.out.print("Введите бренд: ");
        String brand = scanner.nextLine();

        System.out.print("Введите размер экрана (дюймы): ");
        int size = scanner.nextInt();

        System.out.print("Это Smart TV? (1 - да, 0 - нет): ");
        boolean isSmart = scanner.nextInt() == 1;

        return new Television(brand, size, isSmart);
    }

    // Метод для создания телевизора со случайными параметрами
    private static Television createRandomTelevision() {
        Random random = new Random();

        String[] brands = {"Sony", "Panasonic", "Philips", "Toshiba", "Sharp"};
        String brand = brands[random.nextInt(brands.length)];

        int size = 32 + random.nextInt(60); // от 32 до 91 дюйма
        boolean isSmart = random.nextBoolean();

        return new Television(brand, size, isSmart);
    }
}
