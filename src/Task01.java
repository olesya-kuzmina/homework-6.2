public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент с индексом " + i + ": " + array[i]);
        }

    }
}
