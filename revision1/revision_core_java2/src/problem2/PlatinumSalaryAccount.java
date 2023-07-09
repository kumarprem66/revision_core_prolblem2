package problem2;

public class PlatinumSalaryAccount extends
        GoldSalaryAccount implements HealthInsurance{


    @Override
    public void redeemRewardPoints(int rewardPoints) {
        double cashValue = rewardPoints * 0.08 / 100; // 8 paisa per reward point
        // Add cash value to the balance
    }


    @Override
    public double getHICoverPremium(int coverageAmount) {
        double premiumByCompany = HealthInsurance.super.getHICoverPremium(coverageAmount);
        // Additional charges for extra coverage
        double additionalCoverageCharges = (coverageAmount - 400000) / 100000.0 * 2500;
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
