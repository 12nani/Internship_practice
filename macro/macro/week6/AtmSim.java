class Account {
    private int accountNumber;
    private String accountName;
    private double balance;
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
class ATMSimulator {
    private Account[] accounts;
    private int numAccounts;

    public ATMSimulator() {
        this.accounts = new Account[10];
        this.numAccounts = 0;
    }
    public void addAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = account;
            numAccounts++;
          System.out.println("Account Added Successfully");
          
        } else {
            System.out.println("Error: ATM Simulator is full");
        }
    }
    public void removeAccount(Account account) {
        int index = -1;
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i] == account) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < numAccounts - 1; i++) {
                accounts[i] = accounts[i + 1];
            }
            accounts[numAccounts - 1] = null;
            numAccounts--;
          System.out.println("Account Removed Successfully");
        }
    }
    public boolean transact(int accountNumber, double amount, String type) {
    Account account = findAccount(accountNumber);
    if (account == null) {
        System.out.println("Error: Account not found");
        return false;
    }
    if (type.equals("deposit")) {
        account.deposit(amount);
        return true;
    } else if (type.equals("withdraw")) {
        account.withdraw(amount);
        return true;
    } else if (type.equals("check balance")) {
        account.checkBalance();
        return true;
    } else {
        System.out.println("Error: Invalid transaction type");
        return false;
    }
}
    private Account findAccount(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}
public class AtmSim {
    public static void main(String[] args) {
        ATMSimulator atm = new ATMSimulator();
        Account account1 = new Account(789456, "Nav ", 1000);
        Account account2 = new Account(612309, "John Doe", 2000);
        atm.addAccount(account1);
        atm.addAccount(account2);
        atm.transact(789456, 5000, "withdraw");
        atm.transact(789456, 1050, "deposit");
        atm.transact(789456, 0, "check balance");
        atm.removeAccount(account2);
    }
}