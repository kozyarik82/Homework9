import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Задача 1
        System.out.println(" Задача 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей ");

        // Задача 2
        System.out.println(" Задача 2 ");

        int maxArr = 100000;
        int minArr = 200000;
        for (int j : arr) {
            if (j > maxArr) {
                maxArr = j;
            }
            if (j < minArr) {
                minArr = j;
            }
        }
        System.out.println(" Минимальная сумма трат за день составила " + minArr + " рублей . Максимальная сумма трат за день составила " + maxArr + " рублей ");

        // Задача 3
        System.out.println(" Задача 3 ");

        double mean = sum / arr.length;
        System.out.println(" Средняя сумма трат за месяц составила " + mean + " рублей ");

        // Задача 4
        System.out.println(" Задача 4 ");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        // Задачи повышенной сложности
        // Задача 5
        System.out.println(" Задача 5 ");

        int [][] matrix = new int [3][3];
        int n = 1;
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = n;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Че то у меня ничего не получается


    }

}