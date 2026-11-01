package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class App {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        try {
            orders.add(new Order(1, "Иван", 150, Arrays.asList("Книга", "Ручка")));
            orders.add(new Order(2, "Петр", 300, Arrays.asList("Тетрадь")));
            orders.add(new Order(3, "Анна", 500, Arrays.asList("Рюкзак")));
        } catch (InvalidOrderDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            Order order = findOrder(orders, 1);
            order.displayInfo();
            order.processOrder();
        } catch (OrderNotFoundException | OrderProcessingException e) {
            System.out.println(e.getMessage());
        }
        try {
            Order order = findOrder(orders, 2);
            order.displayInfo();
            order.cancelOrder();
        } catch (OrderNotFoundException | OrderProcessingException e) {
            System.out.println(e.getMessage());
        }
        try {
            findOrder(orders, 10);
        } catch (OrderNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            new Order(4, "", 100, Arrays.asList("Товар"));
        } catch (InvalidOrderDataException e) {
            System.err.println(e.getMessage());
        }
    }
    public static Order findOrder(List<Order> orders, int id) throws OrderNotFoundException {
        for (Order order : orders) {
            if (order.getOrderId() == id) {
                return order;
            }
        }
        throw new OrderNotFoundException("Заказ " + id + " не найден");
    }
}