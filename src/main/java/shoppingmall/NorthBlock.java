package shoppingmall;
import shoppingmall.ShoppingMall;

public class NorthBlock extends ShoppingMall {
    //Fields
    private String shopCategory;
    private int totalShops;

    //Constructors


    public NorthBlock(String mallName, String mallLocation, String shopCategory, int totalShops) {
        super(mallName, mallLocation);
        this.shopCategory = shopCategory;
        this.totalShops = totalShops;
    }

    //Getters and Setters

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    public int getTotalShops() {
        return totalShops;
    }

    public void setTotalShops(int totalShops) {
        this.totalShops = totalShops;
    }

    //Methods
    public String brandStores(){
        return "Apple, Google, Amazon, Samsung, Jio, Tesla, Dell, Lenovo, Nayak";
    }

    public String nonBrandStores(){
        return "Suvarna, Rama, Mounika, Teja";
    }

    public boolean doTheyRepair(){
        return true;
    }

    @Override
    public String toString() {
        return "NorthBlock{" +
                "shopCategory='" + shopCategory + '\'' +
                ", totalShops=" + totalShops +
                '}';
    }
}
