package Queue;


public class main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Deino"));
        shelter.enqueue(new Dog("Ralph"));
        shelter.enqueue(new Cat("Loki"));
        shelter.enqueue(new Cat("Oreo"));


        Animal animal1 = shelter.dequeueAny();
        System.out.println("First Adopted: " + animal1.getAnimalName());
        Animal animal2 = shelter.dequeueDog();
        System.out.println("Adopted dog: " + animal2.getAnimalName());
        Animal animal3 = shelter.dequeueCat();
        System.out.println("Adopted cat: " + animal3.getAnimalName());

    }
}
