import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Введите размер массива: ");
                int n = scanner.nextInt();
                while(n<1){
                    System.out.println("Введите корректный размер массива");
                    n=scanner.nextInt();
                }
                int[] a = new int[n];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                int kolvo = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 0) {
                        kolvo++;
                    }
                }
                System.out.println("Количество нулевых элементов: " + kolvo);
                break;
            case 2:
                System.out.print("Введите количество строк: ");
                int rows = scanner.nextInt();
                System.out.print("Введите количество столбцов: ");
                int columns = scanner.nextInt();
                while(rows<1 || columns<1){
                    System.out.print("Введите корректное количество строк: ");
                    rows = scanner.nextInt();
                    System.out.print("Введите корректное количество столбцов: ");
                    columns = scanner.nextInt();
                }
                int[][] b = new int[rows][columns];
                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        b[i][j] = scanner.nextInt();
                    }
                }
                int minus = 0;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (b[i][j] < 0) {
                            minus++;
                        }
                    }
                }
                System.out.println("Количество отрицательных элементов: " + minus);
                break;
            default:
                System.out.println("Неверный номер задания");
        }
    }
}