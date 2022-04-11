package shoppingmall;


import java.util.LinkedList;

import interfaces.IManagementGreetings;


public class ShoppingMall implements IManagementGreetings { //Class declaration
    //Fields
    private String mallName;
    private String mallLocation;

    //Constructors
    public ShoppingMall(String mallName, String mallLocation) {
        this.mallName = mallName;
        this.mallLocation = mallLocation;
    }

    //Getters and Setters


    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallLocation() {
        return mallLocation;
    }

    public void setMallLocation(String mallLocation) {
        this.mallLocation = mallLocation;
    }

    //Methods
    public String shopTypes(){
        return "Technology, Cloths, Restaurants, and Entertainment";
    }

    public Integer totalStairs(){
        return 4;
    }

    public Integer avgCustomersPerMonth(){
        return 19683;
    }

    public boolean haveParkingSpace(){
        return true;
    }

    public boolean mallSecurityExists(){
        return true;
    }

    //ToString


    @Override
    public String toString() {
        return "ShoppingMall{" +
                "mallName='" + mallName + '\'' +
                ", mallLocation='" + mallLocation + '\'' +
                '}';
    }

    @Override
    public String welcomeToAanandMall(){
        return "We are Happy for your Visit!";
    }

    public String meetUsAtOffice(){
        return "If you see anything, please say something, Thank You!";
    }

    public String customerConcentratedRegion() {
//Concentrated customers regions
    LinkedList<String> customerConcentratedRegion = new LinkedList<String>();

    customerConcentratedRegion.add("Annandale");
    customerConcentratedRegion.add("Burke");
    customerConcentratedRegion.add("Chantilly");
    customerConcentratedRegion.add("Reston");
    customerConcentratedRegion.add("Hendon");
    customerConcentratedRegion.add("Tysons");
    customerConcentratedRegion.add("Springfield");

    return "Frequent visitors to the Aanand Mall is from respective regions - \n" + customerConcentratedRegion + "\n";
}
}







