public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание 7:");
        int n = 4;
        int[][] array = new int[n][n];
        int value = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
