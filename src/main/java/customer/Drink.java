package customer;

    class Drink extends CustomerOrder { // Drink subclass
        private String size; //instance variables

        public Drink (int quantity, String size) { //constructor
            super(quantity);
            this.size = size;
        }

        public double totalPrice() { //instance method to calculate price for the item
            double priceSmall = 2.48;
            double priceMed = 3.99;
            double priceLar = 5.89;
            double total = 0;

            if (size.equals("small")) {
                total = priceSmall * getQuantity();
            } else {
                if (size.equals("medium")) {
                    total = priceMed * getQuantity();
                } else {
                    if(size.equals("large")) {
                        total = priceLar * getQuantity();
                    }
                }
            }
            System.out.println("Drink -" + total);
            return total; //totalPrice
        }


        public String toString() {
            return "Drink ("+ size + "): " + super.toString() ;
        }

    }

