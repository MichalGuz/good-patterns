package easy_eats;

public class EasyEatsApplication {
    private EasyEatsOrderService service;
    private EasyEatsOrderRepository repository;
    private EasyEatsContactService contact;
    private EasyEatsProducerProcessor producerProcessor;

    public EasyEatsApplication(EasyEatsOrderService service, EasyEatsOrderRepository repository, EasyEatsContactService contact, EasyEatsProducerProcessor producerProcessor) {
        this.service = service;
        this.repository = repository;
        this.contact = contact;
        this.producerProcessor = producerProcessor;
    }

    public void process(final OrderRequest orderRequest){
        boolean isOrder = service.order(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrder());

        if(isOrder) {
            repository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrder());
            contact.inform(orderRequest.getCustomer());
            producerProcessor.producersProcess();
        } else {
            System.out.println("Please check your order thoroughly.");
        }
    }
}
