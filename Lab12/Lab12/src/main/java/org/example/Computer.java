package org.example;
public class Computer {
    protected String model;
    protected int id;
    protected int ram;
    public Computer(String model,int id,int ram) {
        this.model=model;
        this.id=id;
        this.ram=ram;
    }
    @Override
    public String toString() {
        return "id="+id+", model="+model+", ram="+ram+" GB";
    }
}