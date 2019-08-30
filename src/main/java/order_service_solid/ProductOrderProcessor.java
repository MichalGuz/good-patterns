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

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrder = orderService.order(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrderData());

        if(isOrder){
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrderData());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
