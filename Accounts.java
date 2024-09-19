public class Accounts {
    int balance = 2000;

    void withdraw(int amt){
        if(amt > balance){
            System.out.println("Withdraw Transaction Invalid . \nYou only have "+balance+" in your account.\n");
        } else {
            balance -= amt;
            System.out.println("Withdraw Transaction Successfull.\nYour Balance: "+balance+"\n");
        }
    }

    void deposit(int amt){
        balance += amt;
        System.out.println("Deposit Transaction Successfull.\nYour Balance: "+balance+"\n");
    }

    public static void main(String[] args) {
        Accounts obj1 = new Accounts() ;
        obj1.deposit(2000);
        obj1.withdraw(200);
        obj1.withdraw(4000);
    }

}
