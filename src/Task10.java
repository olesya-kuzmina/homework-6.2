import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество рядов: ");
        int n = scanner.nextInt();

        System.out.print("Введите количество мест в каждом ряду: ");
        int m = scanner.nextInt();

        System.out.print("Введите количество билетов для продажи: ");
        int k = scanner.nextInt();

        int[][] seats = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = (int) (Math.random() * 2);
            }
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int start = -1;

            for (int j = 0; j < m; j++) {
                if (seats[i][j] == 0) {
                    if (count == 0) {
                        start = j;
                    }
                    count++;
                } else {
                    count = 0;
                }

                if (count == k) {
                    System.out.println("Можно выполнить запрос:");
                    System.out.println("Ряд: " + (i + 1));
                    System.out.println("Места: " + (start + 1) + " - " + (start + k));
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Невозможно выполнить запрос");
        }

    }
}
