package problem2;

public interface PersonalAccidentalCover {

    default double getPACoverPremium(int coverageAmount){

        return coverageAmount*500/100000.0;
    }
}
