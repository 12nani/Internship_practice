class BankAccount {
  private String accountNumber;
  private double balance;
  private String accountName;
  public BankAccount(String accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountName = accountHolderName;
  }
  public String getAccountNumber() {
    return accountNumber;
  }
  public double getBalance() {
    return balance;
  }
  public String getAccountName() {
    return accountName;
  }
  public void deposit(double amount) {
    balance += amount;
  }
  public void withdraw(double amount) {
    balance -= amount;
  }
  public void checkBalance() {
    System.out.println("Account Holder Name: " + accountName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: $" + balance);
  }
}

class CheckingAccount extends BankAccount {
    private double interestRate;
  public CheckingAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
    super(accountNumber, balance, accountHolderName);
    this.interestRate = interestRate;
  }
  public double getInterestRate() {
    return interestRate;
  }
    public void checkBalance() {
        System.out.println("Account Type: Checking Account");
        super.checkBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;   
    public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }  
    public double getInterestRate() {
        return interestRate;
    }
    public void checkBalance() {
        System.out.println("Account Type: Savings Account");
        super.checkBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CreditAccount extends BankAccount {
    private double creditLimit;  
    public CreditAccount(String accountNumber, double balance, String accountHolderName, double creditLimit) {
        super(accountNumber, balance, accountHolderName);
        this.creditLimit = creditLimit;
    } 
    public double getCreditLimit() {
        return creditLimit;
    }
    public void checkBalance() {
        System.out.println("Account Type: Credit Account");
        super.checkBalance();
        System.out.println("Credit Limit: $" + creditLimit);
    }
}

 class Bankoops {
    public static void main(String[] args) {
        BankAccount checkingAccount = new CheckingAccount("789456123", 1000.00, "Nav", 0.5);
        checkingAccount.checkBalance();
        checkingAccount.deposit(5000.00);
        checkingAccount.checkBalance();
        checkingAccount.withdraw(3000.00);
        checkingAccount.checkBalance();
        
        BankAccount savingsAccount = new SavingsAccount("879546321", 5000.00, "JohnDoe", 1.2);
        savingsAccount.checkBalance();
        savingsAccount.deposit(2000.00);
        savingsAccount.checkBalance();
        savingsAccount.withdraw(2000.00);
        savingsAccount.checkBalance();
        
        BankAccount creditAccount = new CreditAccount("132645798", -2000.00, "Bob marley", 5000.00);
        creditAccount.checkBalance();
        creditAccount.deposit(2000.0);
       creditAccount.checkBalance();
    }
}