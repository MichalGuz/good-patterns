package factory_delivery_abstract_factory;

import org.junit.Test;

public class DeliveryAbstractFactoryTestSuite {
    @Test
    public void testDeliveryFactory() {
        // given
        Delivery delivery;

        // when
        delivery = new Delivery("Jasna 10, Warszawa 00-032, Poland", "23991289234", new EnvelopeDeliveryFactory());
        delivery = new Delivery("Mroczna 7, Wrocław 50-300, Poland", "34123167299", new PacketDeliveryFactory());

        // then
        // do nothing
    }
}
