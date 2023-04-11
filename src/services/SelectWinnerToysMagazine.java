package services;

import models.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class SelectWinnerToysMagazine {

    private Random random = new Random();
    public Toy SelectDrawingToys(DataServiceImpl dataService){
        int count = dataService.count();
        int selectId = random.nextInt(count);
        var toy = dataService.getToy(selectId);
        return toy;
    }

    public void WriteDataInTextFile(Toy toy){
        try(FileWriter writer = new FileWriter("toys.txt", true)){
            writer.write(toy.toString()+"\n");
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
