package Queue;

public class Animal {
    private String name;
    private int arrivalTime;
    private static int counter = 0;

    // Constour
    public Animal(String name){
        this.name = name;
        this.arrivalTime = counter++;
    }

    // Getters
    public String getAnimalName(){
        return name;
    }

    public int getArrivalTime(){
        return arrivalTime;
    }


}
