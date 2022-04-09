package customer;

class ShrimpGumbo extends CustomerOrder { // ShrimpGumbo Sub-class
    private double price; // instance variables
    private String filling;
    private String rice;

    // constructor
    public ShrimpGumbo (int quantity, double price, String filling, String rice)   {
        super(quantity);
        this.price = price;
        this.filling = filling;
        this.rice = rice;
    }

    public double totalPrice() { //instance method
        double total = 0;
        int quantity = getQuantity();

        total = (price * quantity);
        double tax = 0.08 * total;
        total += tax;

        return total;//totalPrice
    }


    public String toString() {
        return "ShrimpGumbo ("+ filling + ") ( " + rice + "): "+ super.toString() +
                ", price: " + price ;
    }

} // ShrimpGumbo class

