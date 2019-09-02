package easy_eats;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private LocalDate dateOfOrder;
    private Double totalPrice;

    public Order(String orderId, LocalDate dateOfOrder, Double totalPrice) {
        this.orderId = orderId;
        this.dateOfOrder = dateOfOrder;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }
}
