// Assignment 10, Question 2
// To extend interface by another interface
// Author: Kushashwa Ravi Shrimali

// interface 1 - to be extended
interface Interface_1 {
    // abstract method, to show the output
    public void show();
}

// interface 2 inheriting interface 1
interface Interface_2 extends Interface_1 {
    // declare function to print on console
    public void print(String s);
}

// Main class, implementing interface 2
public class Extends_Interface_By_Another implements Interface_2{
    
    // defining methods from interface 2
    public void print(String s) {
       System.out.println(s);
    }
    
    public void show() {
      System.out.println("Just showing... Nothing :-D");
    }

    public static void main(String args[]) {
        Extends_Interface_By_Another EI = new Extends_Interface_By_Another();
        EI.show();
        EI.print("Working?");   
    }
}
