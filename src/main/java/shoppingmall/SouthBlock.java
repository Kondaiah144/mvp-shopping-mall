package shoppingmall;

import shoppingmall.ShoppingMall;

public class SouthBlock extends ShoppingMall{

    //Fields
    private String shopCategory;
    private int totalShops;
    private boolean newReleasesAvailable;

    //Constructors


    public SouthBlock(String mallName, String mallLocation, String shopCategory, int totalShops, boolean newReleasesAvailable) {
        super(mallName, mallLocation);
        this.shopCategory = shopCategory;
        this.totalShops = totalShops;
        this.newReleasesAvailable = newReleasesAvailable;
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

    public boolean isNewReleasesAvailable() {
        return newReleasesAvailable;
    }

    public void setNewReleasesAvailable(boolean newReleasesAvailable) {
        this.newReleasesAvailable = newReleasesAvailable;
    }

    //Methods
    public String bestShopsToBuyShirt(){
        return "Asos, Myntra, Koovs, Banana Repubic, Shein";
    }

    public String brandStores(){
        return " Farfetch, Mytra, Banana Republic, MR Porter, Reiss, Bloomingdales," +
                " MatchesFasion, Nordstrom, Uniqlo, Coggles, Rag & Bone";
    }

    //ToString

    @Override
    public String toString() {
        return "SouthBlock{" +
                "shopCategory='" + shopCategory + '\'' +
                ", totalShops=" + totalShops +
                ", newReleasesAvailable=" + newReleasesAvailable +
                '}';
    }
}
