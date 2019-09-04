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
        boolean isOrder;
    }
}
