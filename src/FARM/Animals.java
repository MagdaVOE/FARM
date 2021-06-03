package FARM;

public class Animals {

    public String name;
    public Double weight;
    public final String species;
    public static final Double DEFAULT_ANIMAL_WEIGHT=1.0;

    Animals(String species){
        this.species=species;
        switch(this.species){
            case "cow": this.weight =100.00;
            case "pig": this.weight=50.0;
            case "goeat":this.weight=30.0;
        }
    }




}
