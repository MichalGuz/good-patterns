package easy_eats;

public class HealthyEatsProducer implements EasyEatsProducerProcessor, Producer {

    @Override
    public void producersProcess(){
        System.out.println("HealthyEats");
    }

    @Override
    public String getName(){
        return "HealthyEatsProducer";
    }

    @Override
    public String getContact(){
        return "healthyEats@mail.com";
    }

    @Override
    public String getAccount(){
        return "account number of HE";
    }
}
