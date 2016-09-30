
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    // fields
    private int balance;
    private String firstName;
    private String lastName;
    private int socialSecurity;
    private String EMAIL;
    private String mailingAdress;
    private String name = firstName+lastName;
    private int cash;
    private boolean overdraft;
    public static final int overdraftFee = 3000;
    //constructors
    public Bank(String lastName, String firstName) {
    this.name = firstName + lastName;
    this.balance = 0;
}

public void withdraw(int n){
    if (balance - n > 0 && overdraft)
    {
        cash  += (n);
        balance -= (n+30);
    }
    else if (balance - n >0)
    {
        cash += balance;
        balance = 0;
    }
    {
        cash +=n;
        balance -=n;
    }
}

public void deposit(int n) {
    if (balance - n > 0)
    {
        balance = cash;
        cash = 0;
    }
    else 
    {
        cash -= Math.abs(n);
        balance +=Math.abs(n);
    }
}
}
