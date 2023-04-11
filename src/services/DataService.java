package services;

import models.Toy;

public interface DataService {
    void Add(Toy toy);
    void Edit(int id, Toy toy);
    void Delete(int id);
}
