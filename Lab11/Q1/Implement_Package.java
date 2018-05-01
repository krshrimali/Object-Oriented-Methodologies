// Implementing package formed
// Author: Kushashwa Ravi Shrimali

// importing all classes from Animals package
import Animals.*;

public class Implement_Package {
    public static void main(String args[]) {
        Animals.Mammal m = new Animals.Mammal(); // creating Mammal object
        // calling both methods of the mammal
        m.eat();
        m.travel();
    }
}
