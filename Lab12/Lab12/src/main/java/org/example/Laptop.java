package org.example;
public class Laptop extends Computer {
    private double screenSize;
    public Laptop(String model,int id,int ram,double screenSize) {
        super(model,id,ram);
        this.screenSize=screenSize;
    }
    @Override
    public String toString() {
        return "Laptop: "+super.toString()+", screenSize="+screenSize+" inches";
    }
}