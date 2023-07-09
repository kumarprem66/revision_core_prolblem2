package problem2;

abstract public class SalaryAccount implements SavingAccount {

    @Override
    public final void deductSMSCharges(int noOfDays){
        //no need to write anythiong in body
    }

    @Override
    public final void deductATMCharges(int noOfTransactions){
        //no need to write anythiong in body
    }

    abstract void redeemRewardPoints(int rewardPoints);

}
