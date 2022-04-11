package shoppingmall;

import shoppingmall.ShoppingMall;

import java.util.List;
import java.util.Map;
import shoppingmall.ShoppingMall;

public class ShopOwners extends ShoppingMall {

    private List attendeesMapping;

    //Constructors


    public ShopOwners(String mallName, String mallLocation,  List attendeesMapping) {
        super(mallName, mallLocation);
        this.attendeesMapping = attendeesMapping;
    }

    public static void main(String[] args) {

        List<String> owners = List.of("Suman", "Peter", "Michelle",
                "Tata", "Pamela", "Suvarna", "Ratnam", "Puish", "Wes", "Rachel");
        System.out.println("All attended owners names: " + owners + "\n");

        Map<String, List<String>> attendeesMapping =
                Map.of("Mega Tech Expo", List.of("Suman", "Peter"),
                        "Product Fundraiser", List.of("Michelle", "Tata", "Pamela"),
                        "Design Thinking Workshop", List.of("Suvarna", "Ratnam", "Puish"),
                        "Martial Arts Awareness Program", List.of("Wes", "Rachel"));

        System.out.println( "Last year owners attended strategic events: \n" + attendeesMapping);
    }
//ToString


    @Override
    public String toString() {
        return "ShopOwners{" +
                "attended Strategic Events =" + attendeesMapping +
                '}';
    }
}
