package problem1;

public class EMIByFlatRate implements EquatedMonthlyInstallment{
    @Override
    public double getEMIAmount(double principalAmount, double interestRate,
                               double timePeriod) {
        double interest_value = principalAmount*interestRate/100;
        principalAmount = principalAmount+interest_value;
       return principalAmount/timePeriod*12;

    }
}
