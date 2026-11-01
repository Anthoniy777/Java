package org.example;
public class Server extends Computer {
    private int rackUnits;
    public Server(String model,int id,int ram,int rackUnits) {
        super(model,id,ram);
        this.rackUnits=rackUnits;
    }
    @Override
    public String toString() {
        return "Server: "+super.toString()+", rackUnits="+rackUnits;
    }
}