package org.example;
import java.util.List;
public class University {
    private int id;
    private String name;
    private String country;
    private int rank;
    private List<Integer> studentRatings;
    public University(int id,String name,String country,int rank,List<Integer> studentRatings) {
        this.id=id;
        this.name=name;
        this.country=country;
        this.rank=rank;
        this.studentRatings=studentRatings;
    }
    public double getAverageRating() {
        if(studentRatings.isEmpty()) {
            return 0;
        }
        int sum=0;
        for(int rating:studentRatings) {
            sum+=rating;
        }
        return (double)sum/studentRatings.size();
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank=rank;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    @Override
    public String toString() {
        return "ID: "+id+", название: "+name+", страна: "+country+", рейтинг: "+rank+", средний балл: "+String.format("%.2f",getAverageRating());
    }
}