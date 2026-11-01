package org.example;
public class App {
    public static void main(String[] args) {
        RoundTable table = new RoundTable(1.2, "Дерево");
        System.out.println("Материал стола: " + table.getMaterial());
        System.out.println("Диаметр стола: " + table.getDiameter() + " м");
        System.out.printf("Площадь стола: %.2f м²%n", table.area());
    }
}