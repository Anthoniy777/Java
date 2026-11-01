package org.example;
public class Restaurant {
    String name;
    String cuisine;
    double rating;
    static int totalRestaurants = 0;
    static double totalRating = 0;
    public Restaurant(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        totalRestaurants++;
        totalRating += rating;
    }
    public static double getAverageRating() {
        if (totalRestaurants == 0) {
            return 0;
        }
        return totalRating / totalRestaurants;
    }
}