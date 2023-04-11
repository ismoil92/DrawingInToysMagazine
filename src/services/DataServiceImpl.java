package services;

import models.Toy;

import java.util.ArrayList;

public class DataServiceImpl implements DataService{

    private ArrayList<Toy> data;

    public DataServiceImpl(){
        data = new ArrayList<>();
    }

    public Toy getToy(int id){
        return data.get(id);
    }
    @Override
    public void Add(Toy toy) {
        data.add(toy);
    }

    @Override
    public void Edit(int id, Toy toy) {
        data.set(id, toy);
    }

    @Override
    public void Delete(int id) {
        data.remove(id);
    }

    public ArrayList<Toy> getToys(){
        return data;
    }

    public int count(){
        return data.size();
    }
}
