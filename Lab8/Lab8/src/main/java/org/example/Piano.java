package org.example;
public class Piano extends Instrument {
    private int keys;
    public Piano(String name, String type, String sound, int keys) {
        super(name, type, sound);
        this.keys = keys;
    }
    public int getKeys() {
        return keys;
    }
    public void setKeys(int keys) {
        this.keys = keys;
    }
    @Override
    public void play() {
        System.out.println("Клавишный звук");
    }
    public void playChord() {
        System.out.println("Играю аккорд на пианино");
    }
}