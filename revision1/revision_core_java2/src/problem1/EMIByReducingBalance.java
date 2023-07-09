package problem1;

public class EMIByReducingBalance implements EquatedMonthlyInstallment{

    @Override
    public double getEMIAmount(double principalAmount, double interestRate, double timePeriod) {

        double r = interestRate/1200;
        double n = timePeriod*12;
        double emi = principalAmount*(r*Math.pow(1+r,n)/(Math.pow(1+r,n)-1));

        return Math.round(emi*100.0)/100.0;

    }
}
