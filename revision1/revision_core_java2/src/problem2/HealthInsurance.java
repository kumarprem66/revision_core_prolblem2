package problem2;

public interface HealthInsurance {

    default double getHICoverPremium(int coverageAmount){
        return coverageAmount*2500/100000.0;
    }

}
