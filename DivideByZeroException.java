// Assignment 10, Question 4
// DivideByZeroException : Finally Block, Throws Keyword and try-catch block
// Author: Kushashwa Ravi Shrimali

// Main class
public class DivideByZeroException {
    public static void divideByZ() throws ArithmeticException{
        int a = 5/0; // this throws the exception
    }
    public static void main(String args[]){
       try {
          divideByZ();
       }
       catch(ArithmeticException e) {
           System.out.println(e);
       }
       finally {
           // this usually does clean up etc.
           // here, does nothing. Just for demonstration
           System.out.println("Entered the finally block. Now exiting ;)");
       }
    }
}
