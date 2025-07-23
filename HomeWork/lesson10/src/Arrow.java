import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        int count = 0;

        for (int i = 0; i <= sequence.length() - 5; i++) {
            String substring = sequence.substring(i, i + 5);
            if (substring.equals(">>-->") || substring.equals("<--<<")) {
                count++;
            }
        }

        System.out.println(count);
    }
}