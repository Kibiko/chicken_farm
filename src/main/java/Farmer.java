public class Farmer {

    //PROPERTIES

    private String name;
    private int collectedEggs;

    //CONSTRUCTOR

    public Farmer(String name){
        this.name = name;
        this.collectedEggs =0;
    }

    //BEHAVIOUR

    public String getName(){
        return this.name;
    }

    public int getCollectedEggs(){
        return this.collectedEggs;
    }

    public void collectEggs(Farm farm){
        int sum = 0;
        for (Chicken chicken : farm.getChickens()){
            sum += chicken.getEggs();
            chicken.setEggs(0);
        }
        this.collectedEggs = sum;
    }

    public void assignEggsForSale(Farm farm){
        farm.setEggsForSale(this.collectedEggs-2);
        this.collectedEggs = 2;

    }

}
