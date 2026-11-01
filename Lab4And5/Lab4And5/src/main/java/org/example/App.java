package org.example;
public class App {
    public static void main(String[] args) {
        Phone phone=new Phone("Samsung","Galaxy S25",3000);
        phone.applyDiscount(15);
        System.out.println(phone);
        System.out.println();
        Laptop[] laptops={
                new Laptop("Lenovo",8,1800),
                new Laptop("ASUS",16,2500),
                new Laptop("HP",32,3200),
                new Laptop("Acer",16,2100),
                new Laptop("Dell",64,4500),
                new Laptop("MSI",32,3800)
        };
        System.out.println("Все ноутбуки:");
        for (Laptop laptop:laptops) {
            System.out.println(laptop);
        }
        Laptop maxRam=laptops[0];
        Laptop maxPrice=laptops[0];
        for (int i=1;i<laptops.length;i++) {
            if (laptops[i].getRam()>maxRam.getRam()) {
                maxRam=laptops[i];
            }
            if (laptops[i].getPrice()>maxPrice.getPrice()) {
                maxPrice=laptops[i];
            }
        }
        System.out.println("Ноутбук с максимальным объемом RAM:");
        System.out.println(maxRam);
        System.out.println("Самый дорогой ноутбук:");
        System.out.println(maxPrice);
        System.out.println();
        User[] users={
                new User("admin1",Role.ADMIN),
                new User("user1",Role.USER),
                new User("guest1",Role.GUEST),
                new User("admin2",Role.ADMIN),
                new User("user2",Role.USER)
        };
        System.out.println("Администраторы:");
        for (User user:users) {
            if (user.getRole()==Role.ADMIN) {
                System.out.println(user);
            }
        }
    }
}