public class BankAccountTest{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(100.0, 200.0);
        BankAccount account2 = new BankAccount(300.0, 400.0);

        System.out.println(account1.getCheckingAcctBal());
        System.out.println(account1.getSavingAcctBal());

        account1.depositMoney("checking",100);
        System.out.println(account1.getCheckingAcctBal());
        account1.withdrawMoney("checking",100);
        System.out.println(account1.getSavingAcctBal());
        System.out.println(account1.getBalance());
    }
}