package easy_eats;

public class MasterFoodProducer implements EasyEatsProducerProcessor, Producer {
   @Override
   public void producersProcess(){
       System.out.println("MasterFood - something special");
   }

    @Override
    public String getName(){
       return "MasterFoodProducer";
    }

    @Override
    public String getContact(){
       return "MFP@mail.com";
    }

    @Override
    public String getAccount(){
       return "account number of MFP";
    }
}
