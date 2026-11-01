package org.example;
public class App {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar("Yamaha F310", "Акустическая гитара", 900, 6),
                new Guitar("Fender CD-60", "Акустическая гитара", 1200, 6),
                new Piano("Yamaha P-45", "Цифровое пианино", 2500, 88),
                new Piano("Casio CDP-S110", "Цифровое пианино", 2200, 88),
                new Piano("Roland FP-10", "Цифровое пианино", 2700, 88)
        };
        for (Instrument instrument : instruments) {
            instrument.displayInfo();
            instrument.tune();
            instrument.play();
            System.out.println();
        }
    }
}