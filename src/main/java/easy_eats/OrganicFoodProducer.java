package easy_eats;

public class OrganicFoodProducer implements EasyEatsProducerProcessor, Producer {
    @Override
    public void producersProcess(){
        System.out.println("Organic food - only the best harvest.");
    }


    @Override
    public String getName(){
        return "Organic Food";
    }

    @Override
    public String getContact(){
        return "OrganicFood@mail.com";
    }

    @Override
    public String getAccount(){
        return "account number of Organic Food";
    }
}
