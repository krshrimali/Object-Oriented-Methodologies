// Question 3 : Assignment 10
// Implementation of Hybrid Inheritance using Interface
// Author: Kushashwa Ravi Shrimali

// Tree looks like this
//                    A
//                 B     C   
//                    D

// The base interface, D
interface D {
    int A = 6;
    int B = 5;
}

interface B extends D {
    int C = 4;
    int D = 3;
}

interface C extends D {
    int E = 3;
    int F = 3;
}

// Multi-level inheritance using interface
interface A extends C, B {
   int G = 7;
}

// Main class implementing final interface, A
class Hybrid_Interface implements A{
    public static void main(String args[]) {
        Hybrid_Interface H = new Hybrid_Interface();
        System.out.println(H.A + H.B + H.C + H.D + H.E + H.F + H.G); 
    }
}
