package org.example;
public class Desktop extends Computer {
    private String monitor;
    public Desktop(String model,int id,int ram,String monitor) {
        super(model,id,ram);
        this.monitor=monitor;
    }
    @Override
    public String toString() {
        return "Desktop: "+super.toString()+", monitor="+monitor;
    }
}