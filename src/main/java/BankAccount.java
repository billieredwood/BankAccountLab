import java.time.LocalDate;

// properties
public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

// constructor
public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.accountNumber = accountNumber;
    this.balance = 0.0; // initial balance is 0
}


public String getFirstName(){
    return this.firstName;
}
public void setFirstName(String setFirstName){
    this.firstName = setFirstName;
}
public String getLastName(){
    return this.lastName;
}
public void setLastName(String setLastName){
    this.lastName = setLastName;
}

public LocalDate getDateOfBirth(){
    return this.dateOfBirth;
}
public void setDateOfBirth(LocalDate setDateOfBirth){
    this.dateOfBirth = setDateOfBirth;
}
public int getAccountNumber() {
    return this.accountNumber;
}
public void setAccountNumber(int newNumber) {
    this.accountNumber = newNumber;
}
public double getBalance() {
    return this.balance;
}
public void setBalance(double setBalance) {
    this.balance = setBalance;
}

public double deposit(double amount){
    return this.balance + amount;
}
public double withdraw(double amount) {
    return this.balance - amount;
}

public double payInterest(){
    return (this.balance + (this.balance * 0.05));
}

}
