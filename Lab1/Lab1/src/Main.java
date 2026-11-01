import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите радиус:");
                double r = scanner.nextDouble();
                while(r<0.1){
                    System.out.println("Введите радиус:");
                    r = scanner.nextDouble();
                }
                double c = 2 * Math.PI * r;
                System.out.println("Длина окружности: " + c);
                break;
            case 2:
                System.out.println("Введите a:");
                double a = scanner.nextDouble();
                System.out.println("Введите b:");
                double b = scanner.nextDouble();
                System.out.println("Введите c:");
                double d = scanner.nextDouble();
                double discriminant = b * b - 4 * a * d;
                System.out.println("Дискриминант: " + discriminant);
                if (discriminant > 0) {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
                else if (discriminant == 0) {
                    double x = -b / (2 * a);
                    System.out.println("x = " + x);
                }
                else {
                    System.out.println("Нет корней");
                }
                break;
            case 3:
                System.out.println("Введите число:");
                int number = scanner.nextInt();
                number = Math.abs(number);
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                System.out.println("Сумма цифр: " + sum);
                break;
            case 4:
                System.out.println("Введите страну");
                scanner.nextLine();
                String str=scanner.nextLine();
                switch(str){
                    case "Беларусь":
                        System.out.println("Минск");
                        break;
                    case "Германия":
                        System.out.println("Берлин");
                        break;
                }
                break;
            default:
                System.out.println("Неверный номер задания");
        }
        scanner.close();
    }
}