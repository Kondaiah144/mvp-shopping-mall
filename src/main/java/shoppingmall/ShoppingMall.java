package shoppingmall;

import java.util.HashMap;
import java.util.LinkedList;

public class ShoppingMall {
    //Fields
    Integer mallId;
    String mallName;
    Integer mallManagingOfficeNumber;
    String mallLocation;

    public static void main(String[] args) {

//Concentrated customers regions
        LinkedList<String> customerConcentratedRegion = new LinkedList<String>();

        customerConcentratedRegion.add("Annandale");
        customerConcentratedRegion.add("Burke");
        customerConcentratedRegion.add("Chantilly");
        customerConcentratedRegion.add("Reston");
        customerConcentratedRegion.add("Hendon");
        customerConcentratedRegion.add("Tysons");
        customerConcentratedRegion.add("Springfield");

        System.out.println("Frequent visitors to the Aanand Mall is from respective regions - \n" + customerConcentratedRegion + "\n");

//Average Yearly Shopping Mall Revenue Data
        HashMap<String, Integer> avgYearlyRevenueData = new HashMap<String, Integer>();

        avgYearlyRevenueData.put("Techonology - $", 5000000);
        avgYearlyRevenueData.put("Cloths - $", 7000000);
        avgYearlyRevenueData.put("Restarents - $", 3000000);
        avgYearlyRevenueData.put("Entertainment - $", 9000000);
        avgYearlyRevenueData.put("Skill Training - $", 800000);

        System.out.println("Aanand Mall's Yearly Revenue: \n"  + avgYearlyRevenueData + "\n");

    }
}


