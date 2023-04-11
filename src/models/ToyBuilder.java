package models;

public class ToyBuilder {
    private static int id=0;
    private static ToyBuilder builder;
    private Toy toy;

    public static ToyBuilder getInstance(){
        if(builder == null)
            builder = new ToyBuilder();
        builder.toy = new Toy();
        id++;
        return builder;
    }

    public ToyBuilder setName(String name){
        builder.toy.setName(name);
        return this;
    }

    public ToyBuilder setCount(int count){
        builder.toy.setCount(count);
        return this;
    }

    public ToyBuilder setWeight(int weight){
        builder.toy.setWeight(weight);
        return this;
    }

    public ToyBuilder setFallingOut(double fallingOut){
        builder.toy.setFallingOut(fallingOut);
        return this;
    }

    public Toy build(){
        return toy;
    }

    @Override
    public String toString() {
        return "ToyBuilder{" +"id="+id+
                "toy=" + toy.toString() +
                '}';
    }
}
