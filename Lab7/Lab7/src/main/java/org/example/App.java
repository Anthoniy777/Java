package org.example;
public class App {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("La Piazza", "Итальянская", 8.5);
        Restaurant restaurant2 = new Restaurant("Sakura", "Японская", 9.2);
        Restaurant restaurant3 = new Restaurant("Burger House", "Американская", 7.8);
        Restaurant restaurant4 = new Restaurant("Le Gourmet", "Французская", 9.5);
        System.out.println("Средний рейтинг ресторанов: " + Restaurant.getAverageRating());
    }
}