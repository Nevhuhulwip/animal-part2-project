import java.util.ArrayList;

public class Home {
    ArrayList<Animal> myAnimal = new ArrayList<Animal>();

    public void adoptPet(Animal pet) {
        myAnimal.add(pet);
    }
    public void makeAllSounds(){
        for (Animal a: myAnimal) {
            a.sound();
        }
    }
}
