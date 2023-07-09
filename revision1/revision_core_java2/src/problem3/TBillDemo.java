package problem3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TBillDemo {

    public static LocalDate getMaturityDate(String auctionDesc){

        String[] arr = auctionDesc.split(" ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        return LocalDate.parse(arr[2],formatter);

    }

    public static LocalDate getSettlementDate(LocalDate maturityDate,String auctionDesc){

        String[] descParts = auctionDesc.split(" ");
        int daysBeforeAuction = Integer.parseInt(descParts[0]);
        return maturityDate.minusDays(daysBeforeAuction);
    }

    public static LocalDate getAnotherDate(LocalDate settlementDate, int days) {
        return settlementDate.plusDays(days);
    }

    public static double getInitialInvestmentAmount(double maturityAmount, String auctionDesc) throws InvalidMaturityAmountException {
        String[] descParts = auctionDesc.split(" ");
        double yieldToMaturityPercentage = Double.parseDouble(descParts[3]);
        double durationOfTBill = Double.parseDouble(descParts[0]);

        if (maturityAmount % 10000 != 0) {
            throw new InvalidMaturityAmountException("Invalid maturity amount. Must be a multiple of 10000.");
        }

        double initialInvestment = 100 / (((yieldToMaturityPercentage * durationOfTBill) / 36500) + 1) * (maturityAmount / 100);
        return initialInvestment;
    }
}
