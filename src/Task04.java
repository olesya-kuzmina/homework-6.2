import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4:");
        int[] sourceArray = new int[100];
        int[] resultArray = new int[100];
        Random random = new Random();


        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(856) - 300;
        }


        System.out.println("Исходный массив:");
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.print(sourceArray[i] + " ");
        }
        System.out.println();

        int index = 0;

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > 0) {
                resultArray[index] = sourceArray[i];
                index++;
            }
        }

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] == 0) {
                resultArray[index] = sourceArray[i];
                index++;
            }
        }

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] < 0) {
                resultArray[index] = sourceArray[i];
                index++;
            }
        }

        System.out.println("Результирующий массив:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();

    }
}
