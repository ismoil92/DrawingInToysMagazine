import models.ToyBuilder;
import services.DataServiceImpl;
import services.SelectWinnerToysMagazine;

public class Main {
    public static void main(String[] args) {
        createToysAndWriteInTextFile();
    }


    public static void createToysAndWriteInTextFile(){

        DataServiceImpl dataService = new DataServiceImpl();
        SelectWinnerToysMagazine toysMagazine = new SelectWinnerToysMagazine();

        var toys1 = ToyBuilder.getInstance()
                .setName("Медведь").setCount(1).
                setWeight(1).setFallingOut(0.9).build();

        var toys2 = ToyBuilder.getInstance()
                .setName("Автомат").setCount(2)
                .setWeight(2).setFallingOut(0.1).build();

        var toys3 = ToyBuilder.getInstance()
                .setName("Машинка").setCount(2).
                setWeight(3).setFallingOut(0.3).build();

        var toys4 = ToyBuilder.getInstance()
                .setName("Кукла").setCount(2)
                .setWeight(2).setFallingOut(0.1).build();

        dataService.Add(toys1);
        dataService.Add(toys2);
        dataService.Add(toys3);
        dataService.Add(toys4);

        //dataService.Edit(3, toys1);

        var result = toysMagazine.SelectDrawingToys(dataService);

        toysMagazine.WriteDataInTextFile(result);
    }
}