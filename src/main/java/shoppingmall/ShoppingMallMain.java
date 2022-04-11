package shoppingmall;

import java.util.Collections;

public class ShoppingMallMain {
    public static void main(String[] args) {

//Information and Road Map about Aanand Shopping Mall
    ShoppingMall shoppingMallA = new ShoppingMall("Aanand Shopping Mall", "Fairfax, VA");

    WestBlock westBlockA = new WestBlock("Aanand Shopping Mall", "Fairfax", "Entertainment", 5000,9 );

    EastBlock eastBlockA = new EastBlock("Aanand Shopping Mall", "Fairfax", "Restaurants", 67, true);

    SouthBlock southBlockA = new SouthBlock("Aanand Shopping Mall", "Fairfax", "Cloths", 84,true);

    NorthBlock northBlockA = new NorthBlock("Aanand Shopping Mall", "Fairfax", "Technology", 72 );

    }

}
