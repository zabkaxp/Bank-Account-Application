package bankAccountApp;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;

    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * 1000);
        safetyDepositBoxKey = (int) (Math.random() * 10000);

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Account type: SAVINGS");
        System.out.println("Safety deposit ID: " + safetyDepositBoxID
                + "\nSafety deposit Key: " + safetyDepositBoxKey);
    }
}
