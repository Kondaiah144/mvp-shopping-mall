package shoppingmall;
import shoppingmall.ShoppingMall;

public class WestBlock extends ShoppingMall {

    //Fields
    private String shopsCategory;
    private int theatersCapacity;
    private int totalTheaters;

    //Constructors

    public WestBlock(String mallName, String mallLocation, String shopsCategory,
                     int theatersCapacity, int totalTheaters) {
        super(mallName, mallLocation);
        this.shopsCategory = shopsCategory;
        this.theatersCapacity = theatersCapacity;
        this.totalTheaters = totalTheaters;
    }

    //Getters and Setters

    public String getShopsCategory() {
        return shopsCategory;
    }

    public void setShopsCategory(String shopsCategory) {
        this.shopsCategory = shopsCategory;
    }

    public int getTheatersCapacity() {
        return theatersCapacity;
    }

    public void setTheatersCapacity(int theatersCapacity) {
        this.theatersCapacity = theatersCapacity;
    }

    public int gettotalTheaters() {
        return totalTheaters;
    }

    public void setTotalShops(int totalTheaters) {
        this.totalTheaters = totalTheaters;
    }

    //Methods
    public String brandCompanyTheaters(){
        return "AMC, Regal, Jio, Cenemax";
    }

    public String bestMovieOfTheWeek(){
        return "RRR";
    }

    public boolean areTheyImaxTheaters(){
        return true;
    }

    //ToString

    @Override
    public String toString() {
        return "WestBlock{" +
                "shopsCategory='" + shopsCategory + '\'' +
                ", theatersCapacity=" + theatersCapacity +
                ", totalShops=" + totalTheaters +
                '}';
    }
}

