package problem2;

public class NormalSavingAccount implements SavingAccount{

    private double balance;
    public NormalSavingAccount(double balance){
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {

        balance += amount;

    }

    @Override
    public void withdrawal(double amount) throws InsufficientBalanceException {

        if(amount > balance){
            throw new InsufficientBalanceException("only Rs."+amount+" is available");

        }
        balance -= amount;
    }

    @Override
    public void deductSMSCharges(int noOfDays) throws InsufficientBalanceException {

        double smsCharges = noOfDays*0.10;
        if(smsCharges > balance){
            throw new InsufficientBalanceException("balance is insufficient")
        }
        balance -= smsCharges;
    }

    @Override
    public void deductATMCharges(int noOfTransactions) throws InsufficientBalanceException {

        double atmCharges = noOfTransactions * 2.0; // 2/- per transaction
        if (atmCharges > balance) {
            throw new InsufficientBalanceException("Insufficient balance for deducting ATM charges.");
        }
        balance -= atmCharges;
    }

    @Override
    public double getAvailableBalance() {
        return balance;
    }
}
