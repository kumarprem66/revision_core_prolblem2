package problem2;

public class InsuCareForAll implements PersonalAccidentalCover,HealthInsurance{

    @Override
    public double getPACoverPremium(int coverageAmount) {
        double premiumByCompany = PersonalAccidentalCover.super.getPACoverPremium(coverageAmount);
        return premiumByCompany + premiumByCompany*0.015;


    }

    @Override
    public double getHICoverPremium(int coverageAmount) {
        double premiumByCompany = HealthInsurance.super.getHICoverPremium(coverageAmount);
        return premiumByCompany + premiumByCompany*0.015;
    }
}
