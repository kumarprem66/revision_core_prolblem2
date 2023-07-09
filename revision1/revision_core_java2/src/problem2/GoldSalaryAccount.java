package problem2;

public class GoldSalaryAccount extends SalaryAccount implements PersonalAccidentalCover{
    @Override
    void redeemRewardPoints(int rewardPoints) {

        double cashValue = rewardPoints*0.05 /100;
    }


    @Override
    public double getPACoverPremium(int coverageAmount) {
        double premiumByCompany = PersonalAccidentalCover.super.getPACoverPremium(coverageAmount);
        // Additional charges for extra coverage
        double additionalCoverageCharges = (coverageAmount - 300000) / 100000.0 * 500;
        return premiumByCompany + additionalCoverageCharges;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdrawal(double amount) throws InsufficientBalanceException {

    }

    @Override
    public double getAvailableBalance() {
        return 0;
    }
}
