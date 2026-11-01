package org.example;
public class App {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Guitar("Yamaha", "Струнный", "Звук гитары", 6);
        instruments[1] = new Guitar("Fender", "Струнный", "Звук гитары", 6);
        instruments[2] = new Guitar("Gibson", "Струнный", "Звук гитары", 6);
        instruments[3] = new Piano("Yamaha", "Клавишный", "Звук пианино", 88);
        instruments[4] = new Piano("Casio", "Клавишный", "Звук пианино", 88);
        for (Instrument instrument : instruments) {
            instrument.displayInfo();
            instrument.play();
            if (instrument instanceof Guitar) {
                ((Guitar) instrument).tune();
            }
            if (instrument instanceof Piano) {
                ((Piano) instrument).playChord();
            }
            System.out.println();
        }
    }
}