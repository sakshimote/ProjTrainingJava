package data;

import java.util.List;
import java.util.stream.Collectors;

public class OrdersImplementation {
	
	  public static void main(String[] args) {
	        // Assuming you have a list of orders
	        List<Order> orders = getOrders();

	        // Filter orders by price and status
	        List<Order> filteredOrders = orders.stream()
	                .filter(order -> order.getPrice() > 10000 && (order.getStatus().equals("accepted") || order.getStatus().equals("completed")))
	                .collect(Collectors.toList());

	      
	        System.out.println("Filtered Orders:");
	        for (Order order : filteredOrders) {
	            System.out.println(order);
	        }
	    }

	    // Assuming you have a method to retrieve orders
	    private static List<Order> getOrders() {
	        // Replace with your actual code to retrieve orders
	        return List.of(new Order(1L, 12000, "accepted"),
	                new Order(2L, 8000, "pending"),
	                new Order(3L, 15000, "completed"));
	    }

	    private static class Order {
	        private final Long id;
	        private final int price;
	        private final String status;

	        public Order(Long id, int price, String status) {
	            this.id = id;
	            this.price = price;
	            this.status = status;
	        }

	        public Long getId() {
	            return id;
	        }

	        public int getPrice() {
	            return price;
	        }

	        public String getStatus() {
	            return status;
	        }

	        @Override
	        public String toString() {
	            return "Order{" +
	                    "id=" + id +
	                    ", price=" + price +
	                    ", status='" + status + '\'' +
	                    '}';
	        }
	    }

}
