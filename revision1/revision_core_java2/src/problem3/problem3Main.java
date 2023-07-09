package problem3;

import java.time.LocalDate;

public class problem3Main {

    public static void main(String[] args) {
        String auctionDescriptions[] = {"91 DTB 13042023 6.35 100000", "182 DTB 13072023 6.75 250000", "364 DTB 11012024 6.89 89000"};

        for(String auctionDesc: auctionDescriptions) {
            LocalDate maturityDate = TBillDemo.getMaturityDate(auctionDesc);
            System.out.println("Maturity Date is " + maturityDate);

            LocalDate settlementDate = TBillDemo.getSettlementDate(maturityDate, auctionDesc);
            System.out.println("Settlement Date is " + settlementDate);

            LocalDate allotmentDate = TBillDemo.getAnotherDate(settlementDate, -1);
            System.out.println("Allotment Date is " + allotmentDate);

            LocalDate biddingStartDate = TBillDemo.getAnotherDate(settlementDate, -6);
            System.out.println("Bidding start Date is " + biddingStartDate);

            try{
                double investmentAmount = TBillDemo.getInitialInvestmentAmount(Double.parseDouble(auctionDesc.split(" ")[4]), auctionDesc);
                System.out.println("Investment Amount is " + investmentAmount + "/-");
            }catch(InvalidMaturityAmountException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}



