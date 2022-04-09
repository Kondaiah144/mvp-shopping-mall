package shoppingmall;

import java.util.HashSet;
import shoppingmall.ShoppingMall;

public class ParkingAvailability extends ShoppingMall {
    public static void main(String[] args) {

//Parking Space Information
        System.out.println("*** Find parking Space Information Here ***");

        //Create a HashSet object called numbers
        HashSet<Integer> parkingSpaces = new HashSet<Integer>();

        //Add values to the set
        parkingSpaces.add(6);
        parkingSpaces.add(9);
        parkingSpaces.add(14);
        parkingSpaces.add(20);
        parkingSpaces.add(21);
        parkingSpaces.add(35);
        parkingSpaces.add(39);
        parkingSpaces.add(46);
        parkingSpaces.add(57);
        parkingSpaces.add(63);
        parkingSpaces.add(65);
        parkingSpaces.add(67);
        parkingSpaces.add(80);
        parkingSpaces.add(91);
        parkingSpaces.add(96);
        parkingSpaces.add(116);
        parkingSpaces.add(124);
        parkingSpaces.add(128);
        parkingSpaces.add(134);
        parkingSpaces.add(137);
        parkingSpaces.add(138);
        parkingSpaces.add(145);

        //Show which numbers between 1 and 150 are in the set

        for (int x = 1; x <= 150; x++) {
            if (parkingSpaces.contains(x)) {
                System.out.println(x + " Parking Space is not available :(");
            } else {
                System.out.println(x + " Parking Space is available");
            }
        }
    }
}
