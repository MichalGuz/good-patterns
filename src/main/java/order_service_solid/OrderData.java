package order_service_solid;

import java.time.LocalDate;

public class OrderData {
    LocalDate dateOfOrder;
    String numberOfOrder;
    int quintityOfProducts;
    Double totalPriceOfOrder;

    public OrderData(LocalDate dateOfOrder, String numberOfOrder, int quintityOfProducts, Double totalPriceOfOrder) {
        this.dateOfOrder = dateOfOrder;
        this.numberOfOrder = numberOfOrder;
        this.quintityOfProducts = quintityOfProducts;
        this.totalPriceOfOrder = totalPriceOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getNumberOfOrder() {
        return numberOfOrder;
    }

    public int getQuintityOfProducts() {
        return quintityOfProducts;
    }

    public Double getTotalPriceOfOrder() {
        return totalPriceOfOrder;
    }
}


