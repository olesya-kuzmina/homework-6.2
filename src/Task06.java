import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание 6:");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt();
            }
        }

        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int minElement = array[0][0];
        int maxElement = array[0][0];
        int minCount = 1;
        int maxCount = 1;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                    minCount = 1;
                } else if (array[i][j] == minElement) {
                    minCount++;
                }

                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                    maxCount = 1;
                } else if (array[i][j] == maxElement) {
                    maxCount++;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Наименьший элемент: " + minElement);
        System.out.println("Наибольший элемент: " + maxElement);

        if (minCount > 1) {
            System.out.println("Индексы строк и столбцов с повторениями наименьшего элемента:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (array[i][j] == minElement) {
                        System.out.println("Строка: " + i + ", Столбец: " + j);
                    }
                }
            }
        }

        if (maxCount > 1) {
            System.out.println("Индексы строк и столбцов с повторениями наибольшего элемента:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (array[i][j] == maxElement) {
                        System.out.println("Строка: " + i + ", Столбец: " + j);
                    }
                }
            }
        }

        System.out.println("Время выполнения поиска: " + executionTime + " миллисекунд");

    }
}
