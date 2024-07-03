import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        NoiseZoo noiseZoo = new NoiseZoo(animals);
        noiseZoo.speakAll();
    }

}
