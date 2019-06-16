package bankAccountApp;

//git push -f origin master

public abstract class Account implements IBaseRate {
    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int index = 10000;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * 1000);
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued interest: $ " + accruedInterest);
        printBalance();
    }

    //Mathods - transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing " + amount + "$");
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing " + amount + "$");
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring " + amount + "$ to " +
                toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your current balance is: " + balance + "$");

    }

    public void showInfo() {
        System.out.println(name + " " + accountNumber + " " + balance +
                "\nRATE: " + rate + "%");
    }

}
