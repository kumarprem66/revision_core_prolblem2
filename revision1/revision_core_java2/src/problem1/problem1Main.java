package problem1;

public class problem1Main {

    public static void main(String[] args) {

        EMIByReducingBalance emi = new EMIByReducingBalance();
        double em  = emi.getEMIAmount(10000,7,2);
        System.out.println(em);
    }
}
