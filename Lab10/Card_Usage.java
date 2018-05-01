interface CreditCardInterface {
    public void viewCreditCardAmount();
    public void useCard(double payment);
    public void payCredit(double payment );
    public void increaseLimit(double incBy);
}

class SilverCardCustomer implements CreditCardInterface {
    String name;
    int cardnumber;
    double creditAmount = 0;
    double creditLimit = 50000;
    
    SilverCardCustomer(String name, int cardnumber,
           double creditAmount, double creditLimit) {
        name = name;
        cardnumber = cardnumber;
        creditAmount = creditAmount;
        creditLimit = creditLimit;
    }
    
    public void viewCreditCardAmount() {
        System.out.println("Credit Amount: " + creditAmount);
    }
    public void useCard(double payment) {
        if(creditAmount + payment > creditLimit) {
            System.out.println("Error. Can not add above limit.");
        }
        else {
            System.out.println("Adding payment to your card.");
            creditAmount += payment;
            System.out.println("Amount now: " + creditAmount);
        }
    }

    public void payCredit(double payment) {
        if(creditAmount - payment <= 0) {
            System.out.println("Error. Can not withdraw, less money in the card");
        }
        else {
            System.out.println("Withdrawing payment from your card.");
            creditAmount -= payment;
            System.out.println("Amount now: " + creditAmount);
        }
    }
    public void increaseLimit(double incBy) {
        System.out.println("Doesn't happen with silver guys");
    }
}

class GoldCardCustomer extends SilverCardCustomer implements CreditCardInterface{
    int count = 0; // number of times increased limits
    public void increaseLimit(double incBy) {
        if(count == 3) {
            System.out.println("You can NOT inc limit now.");
            System.out.println("Limit extended.");
        }
        else {
            if(incBy > 5000) 
                System.out.println("Can not be increased.");
            else {
                creditLimit += incBy;
                count += 1;
                System.out.println("Limit increased. Thanks!");
                System.out.println("New Limit: " + creditLimit);
            }
        }
    }

    public GoldCardCustomer(String name, int cardnumber, double creditAmount, double creditLimit) {
        super(name, cardnumber, creditAmount, creditLimit);
    }
}

public class Card_Usage {
    public static void main(String args[]) {
        SilverCardCustomer Silver_cust = new SilverCardCustomer("Check", 1223333, 300, 40000);

        GoldCardCustomer Gold_cust = new GoldCardCustomer("Kushashwa Ravi Shrimali",
                1721610034, 3400, 50000);
        Gold_cust.useCard(300);
        Gold_cust.payCredit(200);
        Gold_cust.increaseLimit(3500);
    }
}
