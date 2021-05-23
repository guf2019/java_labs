import java.util.Scanner;
import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку. Для выхода введите 1");
            String str = scanner.nextLine();
            if (str.equals("1"))
                break;
            String[] list = str.split(" / ");
            for (String word : list) {
                System.out.println(word.replace("/", "//"));
            }
        }
    }
}
