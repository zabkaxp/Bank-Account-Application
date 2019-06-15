package bankAccountApp;

//git push -f origin master

public abstract class Account implements IBaseRate{
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;
    static int index = 10000;


    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() *1000);
        return  lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void showInfo(){
        System.out.println(name + " "+ accountNumber + " "+ balance);
}

}
