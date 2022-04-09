package customer;

    class Laddu extends CustomerOrder { // Laddu sub-class
        private String size;
        private String brand;

        public Laddu(int quantity, String size, String brand) { //constructor
            super(quantity);
            this.size = size;
            this.brand = brand;
        }

        public double totalPrice() { //instance method
            double priceSmall = 1.79;
            double priceMed = 2.09;
            double priceLar = 2.49;
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
            System.out.println("Laddu - " + total);
            return total; //totalPrice
        }

        public String toString() {
            return "Laddu ("+ brand + ") (" + size + "): " + super.toString() ;
        }
    }

