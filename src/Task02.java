import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2:");
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 10;
        }

        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        boolean negativeFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && !negativeFound) {
                negativeFound = true;
            } else if (negativeFound) {
                sum += array[i];
            }
        }

        System.out.println("Сумма элементов после первого отрицательного элемента: " + sum);

    }
}
