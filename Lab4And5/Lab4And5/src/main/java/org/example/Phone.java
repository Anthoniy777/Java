package org.example;
public class Phone {
    private String brand;
    private String model;
    private double price;
    public Phone(String brand,String model,double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void applyDiscount(double discount) {
        price=price-price*discount/100;
    }
    @Override
    public String toString() {
        return "Телефон: "+brand+" "+model+", цена со скидкой 15%: "+price;
    }
}