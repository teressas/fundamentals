public class BankAccount {
     // MEMBER VARIABLES
    // attributes: (double) checking balance, (double) savings balance.

    private double checkingBalance;
    private double savingsBalance;
    
    // Create a class member (static) that has the number of accounts created thus far.
    private static int numberOfAccts = 0;

    // Create a class member (static) that tracks the total amount of 
    // money stored in every account created.
    private static double acctBalance = 0;

    public BankAccount(){}

    // In the constructor, be sure to increment the account count.
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.numberOfAccts++;
        // System.out.println(this.checkingBalance);
    }
    
    public int acctCount() {
        return this.numberOfAccts;
    }

    // Create a getter method for the user's checking account balance.
    public double getCheckingAcctBal() {
        return this.checkingBalance;
    }

    // Setter
    public void setCheckingAcctBal(double amount) {
        this.checkingBalance = amount;
        this.acctBalance += amount;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingAcctBal() {
        return this.savingsBalance;
    }

    // Setter
    public void setSavingAcctBal(double amount) {
        this.savingsBalance = savingsBalance;
        this.acctBalance += amount;
    }

    // Create a method that will allow a user to deposit money into either the 
    // checking or saving, be sure to add to total amount stored.
    public void depositMoney(String acctType, double amount){
        if(acctType == "checking"){
            setCheckingAcctBal(getCheckingAcctBal() + amount);
        }
        else if(acctType == "saving") {
            setSavingAcctBal(getSavingAcctBal() + amount);
        }
        else {
            System.out.println("Invalid");
        }
        // return amount;
    }

    // Create a method to withdraw money from one balance. 
    // Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney(String acctType, double amount){
        if(amount < this.checkingBalance || amount < this.savingsBalance) {
            System.out.println("insufficent funds");
        } else if(acctType == "checking"){
            setCheckingAcctBal(getCheckingAcctBal() + amount);
        } else if(acctType == "saving") {
            setSavingAcctBal(getSavingAcctBal() + amount);
        }
        else {
            System.out.println("Invalid");
        }
        // return amount;
    }

    // Create a method to see the total money from the checking and saving.
    public double getBalance() {
        acctBalance = getSavingAcctBal() + getCheckingAcctBal();
        return acctBalance;
    }
}   