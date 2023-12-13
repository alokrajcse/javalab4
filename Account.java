// LAB QUES4
public class Account {
     int accNo;
     float balance;
     static float intInYears = 7.5f; 

    
    public Account(int accNo, float balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    
    public float calculateInterest() {
        float interest = (balance * intInYears) / 100;
        return interest;
    }

    
    public void showAccDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Amount: " + calculateInterest());
    }

    
    public static void changeIntRate(float newRate) {
        intInYears = newRate;
        System.out.println("Interest rate changed to " + newRate + "%");
    }

    public static void main(String[] args) {
        
        Account[] accounts = new Account[3];

        
        accounts[0] = new Account(101, 5000);
        accounts[1] = new Account(102, 7500);
        accounts[2] = new Account(103, 10000);

        
      
System.out.println("Account details before changing interest rate:");
for (int i = 0; i < accounts.length; i++) {
    accounts[i].showAccDetails();
}


Account.changeIntRate(8.0f);


System.out.println("\nAccount details after changing interest rate:");
for (int i = 0; i < accounts.length; i++) {
    accounts[i].showAccDetails();
}

    }
}
