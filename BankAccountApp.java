package bankAccountApp;

public class BankAccountApp {
    public static void main(String[] args){
    Checking checkacc1 = new Checking("tom", "33", 6000);
    Savings savingsacc1 = new Savings("rich", "33", 450000);

    checkacc1.showInfo();
    savingsacc1.showInfo();

    }
}
