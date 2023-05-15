package navapol;

import java.util.List;
import navapol.proj.*;

/**
 * Hello world!
 *
 */
public class App extends LandAnimal
{
    public void enter(App app) {
        String name1 = app.live();
        System.out.println(name1);
    }
    public static void main( String[] args ) {
        LandAnimal landAnimal = new LandAnimal();
        String name = landAnimal.live();
        System.out.println(name);
//        List<Integer> list = List.of(10,1,2);
//        System.out.println(List.of(list, 40).size());
    }
}

class Hm extends AquaticAnimal {
    public static void main(String[] args) {
        AquaticAnimal aquaticAnimal = new AquaticAnimal();
        System.out.println(aquaticAnimal.live());
    }

}

class Um implements Animal {

}