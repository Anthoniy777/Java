package org.example;
public class App {
    public static void main(String[] args) {
        Sport sport = new Sport("Общий спорт", 10, 60);
        Football football = new Football("Футбол", 22, 90, "Высшая лига");
        Tennis tennis = new Tennis("Теннис", 2, 120, "Хард");
        System.out.println("Статический полиморфизм:");
        sport.play();
        sport.play("Команда А");
        sport.play(8);
        football.play("Барселона", "Реал Мадрид");
        tennis.play("Иван", 3);
        System.out.println("Динамический полиморфизм:");
        Sport[] sports = {sport, football, tennis};
        for (Sport item : sports) {
            System.out.println(item.name + ": " + item.getRules());
        }
    }
}