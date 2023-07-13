public class Chicken {

    //PROPERTIES

    private String name;
    private int eggs;

    //CONSTRUCTOR

    public Chicken(String name, int eggs){
        this.name = name;
        this.eggs = eggs;
    }

    //BEHAVIOUR

    public String getName(){
        return this.name;
    }

    public int getEggs(){
        return this.eggs;
    }

    public void setEggs(int eggs){
        this.eggs = eggs;
    }

}
