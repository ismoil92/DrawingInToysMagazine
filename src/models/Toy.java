package models;

public class Toy {
    private String name;
    private int count;
    private int weight;
    private double fallingOut;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setCount(int count){
        this.count=count;
    }

    public int getCount(){
        return this.count;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setFallingOut(double fallingOut){
        this.fallingOut=fallingOut;
    }

    public double getFallingOut(){
        return this.fallingOut;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                ", fallingOut=" + fallingOut +
                '}';
    }
}
