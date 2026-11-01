package org.example;
public class Tennis extends Sport {
    private String courtType;
    public Tennis(String name, int players, int duration, String courtType) {
        super(name, players, duration);
        this.courtType = courtType;
    }
    @Override
    public String getRules() {
        return "1 или 2 игрока";
    }
    public void play(String player, int sets) {
        System.out.println("Теннисист " + player + " играет " + sets + " сетов");
    }
}