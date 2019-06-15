package bankAccountApp;

public class Checking extends Account {

    int debitCardNumber;
    int debitCardPIN;

public Checking(String name, String sSN, double initDeposit){
    super(name, sSN, initDeposit);
    accountNumber = "2" + accountNumber;
}

public void showInfo(){
    super.showInfo();
    System.out.println("Account type: CHECKING");
}
}

