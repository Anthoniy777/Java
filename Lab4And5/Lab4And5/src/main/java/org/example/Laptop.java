package org.example;
public class Laptop {
    private String brand;
    private int ram;
    private double price;
    public Laptop(String brand,int ram,double price) {
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    public int getRam() {
        return ram;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Ноутбук: "+brand+", RAM: "+ram+" ГБ, цена: "+price;
    }
}