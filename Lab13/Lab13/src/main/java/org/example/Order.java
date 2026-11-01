package org.example;
import java.util.List;
public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    private List<String> items;
    public Order(int orderId, String customerName, double totalAmount, List<String> items) throws InvalidOrderDataException {
        setName(customerName);
        setAmount(totalAmount);
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.items = items;
        this.status = "Создан";
    }
    public void setName(String a) throws InvalidOrderDataException{
        if (a == null || a.trim().isEmpty()) {
            throw new InvalidOrderDataException("Имя заказчика не может быть пустым");
        }
    }
    public void setAmount(double am) throws InvalidOrderDataException{
        if (am <= 0) {
            throw new InvalidOrderDataException("Сумма заказа должна быть больше нуля");
        }
    }
    public int getOrderId() {
        return orderId;
    }
    public void processOrder() throws OrderProcessingException {
        if (!status.equals("Создан")) {
            throw new OrderProcessingException("Невозможно обработать заказ");
        }
        status = "Обработан";
        System.out.println("Заказ " + orderId + " обработан");
    }
    public void cancelOrder() throws OrderProcessingException {
        if (status.equals("Отменен") || status.equals("Обработан")) {
            throw new OrderProcessingException("Невозможно отменить заказ");
        }
        status = "Отменен";
        System.out.println("Заказ " + orderId + " отменен");
    }
    public void displayInfo() {
        System.out.println("Номер заказа: " + orderId);
        System.out.println("Заказчик: " + customerName);
        System.out.println("Сумма: " + totalAmount);
        System.out.println("Статус: " + status);
        System.out.println("Товары: " + items);
    }
}