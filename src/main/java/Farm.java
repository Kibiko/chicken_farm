import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Farm {

    //PROPERTIES

    private String name;
    private ArrayList<Chicken> chickens;
    private int eggsForSale;

    //CONSTRUCTOR

    public Farm(String name){
        this.name = name;
        this.chickens = new ArrayList<>();
        this.eggsForSale = 0;
    }

    //BEHAVIOUR

    public String getName(){
        return this.name;
    }

    public void addChicken(Chicken chicken){
        this.chickens.add(chicken);
        this.eggsForSale += chicken.getEggs();
    }

    public int getChickenCount(){
        return this.chickens.size();
    }

    public int getEggsForSale(){
        return this.eggsForSale;
    }

    public void setEggsForSale(int eggsToSet){
        this.eggsForSale = eggsToSet;
    }

    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }


}
