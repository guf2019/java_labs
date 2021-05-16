import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;


public class Lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива m на n: ");
                System.out.print("m= ");
                int m = scanner.nextInt();
                System.out.print("n= ");
                int n = scanner.nextInt();
                int array[][] = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = ((int) (Math.random() * 101) - 50);
                    }
                }

                System.out.println("Введите отрезок a, b");
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                /*ВЫВОД МАССИВА*/
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println("");
                }


                /* ПОДСЧЁТ КОЛИЧЕСТВА ЭЛЕМЕНТОВ */
                System.out.print("Сумма индексов должна быть больше чем? ");
                int item_to_search = scanner.nextInt();
                int count = 0;
                ArrayList<Integer> total_array = new ArrayList<Integer>();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        int tmp[] = new int[2];
                        if (array[i][j] > 0 && i+j > item_to_search) {
                            count += 1;
                            total_array.add(i);
                            total_array.add(j);
                        }
                    }
                }

                /* ВЫВОД */
                System.out.println("Количество элементов с суммой индексов более" + item_to_search + " В массиве равно " + count);
                System.out.println("Индексы элементов удовлетворяющих условиям ");
                for (int i = 0; i < total_array.size(); i++){
                    if (i == 0 || i % 2 == 0){
                        System.out.println("i = " + total_array.get(i));
                    } else {
                        System.out.println("j = " + total_array.get(i));
                        System.out.println("__________________________");
                    }
                }
            }
        } catch (Throwable t){
            System.out.println("Вы вышли из программы, спасибо за использование и хорошего дня =)");
        }
    }
}
