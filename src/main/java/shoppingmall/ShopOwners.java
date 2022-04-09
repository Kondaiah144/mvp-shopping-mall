import shoppingmall.ShoppingMall;

import java.util.List;
import java.util.Map;
import shoppingmall.ShoppingMall;

public class ShopOwners extends ShoppingMall {

    public static void main(String[] args) {

        List<String> owners = List.of("Suman", "Peter", "Michelle",
                "Tata", "Pamela", "Suvarna", "Ratnam", "Puish", "Wes", "Rachel");
        System.out.println("All owners names: " + owners + "\n");

        Map<String, List<String>> attendeesMapping =
                Map.of("Mega Tech Expo", List.of("Suman", "Peter"),
                        "Product Fundraiser", List.of("Michelle", "Tata", "Pamela"),
                        "Design Thinking Workshop", List.of("Suvarna", "Ratnam", "Puish"),
                        "Martial Arts Awareness Program", List.of("Wes", "Rachel"));

        System.out.println( "Last year owners attended strategic events: \n" + attendeesMapping);
    }

}
