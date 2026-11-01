package org.example;
public class App {
    public static void main(String[] args) {
        Playable[] instruments = {
                new Guitar("Yamaha", 6, 3.5),
                new Guitar("Fender", 6, 4.0),
                new Guitar("Ibanez", 7, 3.8),
                new Piano("Casio", 88, 10.5),
                new Piano("Yamaha", 88, 12.0)
        };
        for (Playable instrument : instruments) {
            instrument.tune();
            instrument.play();
            if (instrument instanceof Portable) {
                Portable portable = (Portable) instrument;
                portable.carry();
                System.out.println("Вес: " + portable.getWeight() + " кг");
            }
            System.out.println();
        }
    }
}