package customer;


    class Biryani extends CustomerOrder { // Biryani sub-class
        private double price; //instance variables
        private String flavour;

        public Biryani(int quantity, double price, String flavour) { //constructor
            super(quantity);
            this.price = price;
            this.flavour = flavour;
        }


        public double totalPrice() { //instance method to calculate price
            double total = 0;
            int quantity = getQuantity();

            if(quantity < 9) {
                total = (price * quantity);
                double tax = 0.08 * total;
                total += tax;
            } else {
                total = price * quantity;
            }
            return total;//totalPrice
        }

        public String toString() {
            return "Biryani("+ flavour + "): " + super.toString() + ", price: " + price;
        }

    }


