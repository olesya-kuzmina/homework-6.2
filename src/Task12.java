import java.util.Scanner;

public class Task12 {
        private static int[][] board;
        private static int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
        private static int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};

        public static void main (String[]args){
            System.out.println("Задание 12:");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите размерность массива: ");
            int n = scanner.nextInt();

            board = new int[n][n];
            int startX, startY;

            System.out.print("Введите начальные координаты x и y: ");
            startX = scanner.nextInt();
            startY = scanner.nextInt();

            if (startX < 0 || startX >= n || startY < 0 || startY >= n) {
                System.out.println("Некорректные координаты начальной позиции коня.");
                return;
            }

            if (!solveKnightTour(startX, startY, 1)) {
                System.out.println("Невозможно заполнить доску ходом коня.");
                return;
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%-4d", board[i][j]);
                }
                System.out.println();
            }
        }

        private static boolean solveKnightTour ( int x, int y, int move){
            board[x][y] = move;

            if (move == board.length * board.length) {
                return true;
            }

            for (int i = 0; i < 8; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if (isSafe(nextX, nextY)) {
                    if (solveKnightTour(nextX, nextY, move + 1)) {
                        return true;
                    }
                }
            }

            board[x][y] = 0;
            return false;
        }

        private static boolean isSafe ( int x, int y){
            int n = board.length;
            return (x >= 0 && x < n && y >= 0 && y < n && board[x][y] == 0);

        }
    }
