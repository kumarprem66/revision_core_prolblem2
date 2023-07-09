package problem2;

public interface SavingAccount{
    void deposit(double amount);
    void withdrawal(double amount) throws InsufficientBalanceException;
    void deductSMSCharges(int noOfDays) throws InsufficientBalanceException;
    void deductATMCharges(int noOfTransactions) throws InsufficientBalanceException;
    double getAvailableBalance();
}

