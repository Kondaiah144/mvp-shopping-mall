package shoppingmall;
import shoppingmall.ShoppingMall;

public class EastBlock extends ShoppingMall{

    //Fields
    private String shopsCategory;
    private int totalShops;
    private boolean fastFoodChainExist;

    //Constructors


    public EastBlock(String mallName, String mallLocation, String shopsCategory, int totalShops, boolean fastFoodChainExist) {
        super(mallName, mallLocation);
        this.shopsCategory = shopsCategory;
        this.totalShops = totalShops;
        this.fastFoodChainExist = fastFoodChainExist;
    }

    //Getters and Setters

    public String getShopsCategory() {
        return shopsCategory;
    }

    public void setShopsCategory(String shopsCategory) {
        this.shopsCategory = shopsCategory;
    }

    public int getTotalShops() {
        return totalShops;
    }

    public void setTotalShops(int totalShops) {
        this.totalShops = totalShops;
    }

    public boolean isFastFoodChainExist() {
        return fastFoodChainExist;
    }

    public void setFastFoodChainExist(boolean fastFoodChainExist) {
        this.fastFoodChainExist = fastFoodChainExist;
    }

    //Methods

    public String listOfPopularRestaurants(){
        return "Indaroma, Bombay Bistro, Madras Breakfast, Bawarchi, Babai Meals, Pizza Mahal";
    }

    public String bestFoodToTryInMall(){
        return "Biryani, Idli Sambar, Dosa, Indo Pizza,Shrimp Gumbo,Chicken Lababdar ";
    }

    //ToString

    @Override
    public String toString() {
        return "EastBlock{" +
                "shopsCategory='" + shopsCategory + '\'' +
                ", totalShops=" + totalShops +
                ", fastFoodChainExist=" + fastFoodChainExist +
                '}';
    }
}
