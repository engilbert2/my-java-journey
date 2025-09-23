package DataTypes;

public class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;

    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                '}';

    }

    class Order {
        private String customerId;

        public String getCustomerId() {
            return customerId;
        }

        public Order(String customerId) {
            this.customerId = customerId;
            {

            }
        }
    }
}
