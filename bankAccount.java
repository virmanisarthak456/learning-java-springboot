
/**
 * impliment bank account
 */
class implimentBankAccount {

    double balance;
    String customerName;

    implimentBankAccount(double initialBalance, String customerName) {
        this.balance = initialBalance;
        this.customerName = customerName;
    }

    // method to debit money
    void debitMoney(double debitMoney) {
        this.balance += debitMoney;
        System.err.println("Hi " + this.customerName + " your current balance is : " + this.balance);
    }

    // method to credit money
    void creditMoney(double creditMoney) {
        if (this.balance >= creditMoney) {
            this.balance -= creditMoney;
            System.err.println( "Hi " + this.customerName + " your current balance is : " + this.balance);

        } else {
            System.out.println( "Hi " + this.customerName + " Insufficient balance in your bank account");
            System.err.println( "Hi " + this.customerName +  "your current balance is : " + this.balance);
        }
    }

    void checkBalance() {
        System.out.println("Hi " + this.customerName + " Your current balance is : " + this.balance);
    }

}

public class bankAccount {
    public static void main(String[] args) {

        implimentBankAccount bankAccount = new implimentBankAccount(10000, "Sarthak");
        implimentBankAccount newBankAccount = new implimentBankAccount(5000, "Ram");
        bankAccount.creditMoney(10000);
        bankAccount.checkBalance();

        newBankAccount.creditMoney(4000);
        newBankAccount.checkBalance();

    }
}
