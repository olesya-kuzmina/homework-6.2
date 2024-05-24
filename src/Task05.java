import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5:");
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 10;
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxCount = 0;
        int currentCount = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    endIndex = i;
                    startIndex = endIndex - maxCount + 1;
                }
            } else {
                currentCount = 0;
            }
        }

        System.out.println("Найденный фрагмент:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


    }
}
