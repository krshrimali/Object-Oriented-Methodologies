// Author: Kushashwa Ravi Shrimali
// Lab 11 Assignment: Question 1
// using Animals package
package Animals;

public class Mammal implements Animal {
    // Implementing two methods, declared in interface
    public void eat() {
        System.out.println("Eating");
    }
    public void travel() {
        System.out.println("Travelling");
    }
    public static void main(String args[]) {
        System.out.println("Mammal coming your way :P ");
    }
}
