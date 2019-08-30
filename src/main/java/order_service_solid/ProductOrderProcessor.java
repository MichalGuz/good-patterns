package order_service_solid;

public class ProductOrderProcessor {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public ProductOrderProcessor(final OrderService orderService, final OrderRepository orderRepository, final InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }
}
