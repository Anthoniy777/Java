package org.example;

public class RoundTable {
    private double diameter;
    private String material;
    private int kolvo;

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo1) {
        if (kolvo1 > 0) {
            kolvo = kolvo1;
        }
    }

    public RoundTable(double d1, String m, int k1) {
        this(d1,m);
        kolvo=k1;
    }


    public double getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }

    public RoundTable(double diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public double area() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }
}