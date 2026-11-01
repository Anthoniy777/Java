package org.example;
public class Football extends Sport {
    private String league;
    public Football(String name, int players, int duration, String league) {
        super(name, players, duration);
        this.league = league;
    }
    @Override
    public String getRules() {
        return "11 игроков, 2 тайма";
    }
    public void play(String team, String opponent) {
        System.out.println("Футбольная команда " + team + " играет против " + opponent);
    }
}