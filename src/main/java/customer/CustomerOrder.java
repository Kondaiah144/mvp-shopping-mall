package customer;



abstract class CustomerOrder { //superclass
        private int quantity; //instance variables

        public CustomerOrder(int quantity) { //constructor
            this.quantity = quantity;
        }

        public int getQuantity() { // instance method
            return quantity;
        }

        public abstract double totalPrice();


        public String toString() {
            return "quantity: " + quantity;
        }

    }

