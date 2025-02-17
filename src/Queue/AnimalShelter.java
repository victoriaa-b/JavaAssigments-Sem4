package Queue;

import java.util.Queue;
import java.util.LinkedList;
// First in - First out
// Need enqueue, dequeueAny, dequeueDog and DequeueCat.
public class AnimalShelter {
    private Queue<Dog> dogQueue = new LinkedList<>();
    private Queue<Cat> catQueue = new LinkedList<>();

    public void enqueue (Animal animal){
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    public Dog dequeueDog(){
        return dogQueue.poll();
    }

    public Cat dequeueCat(){
        return catQueue.poll();
    }

    public Animal dequeueAny(){
        if (dogQueue.isEmpty()) return dequeueCat();
        if (catQueue.isEmpty()) return dequeueDog();

        Dog oldestDog = dogQueue.peek();
        Cat oldestCat = catQueue.peek();

        // First in - First Out
        if (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()){
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }


}
