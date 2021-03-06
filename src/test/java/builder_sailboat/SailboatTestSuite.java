package builder_sailboat;

import org.junit.Assert;
import org.junit.Test;

public class SailboatTestSuite {
    @Test
    public void testSailboatNew() {
        // given
        Sailboat sailboat1 = new Sailboat.SailboatBuilder()
                .setSailboatType("Cutter")
                .setBoatLength(6)
                .setSailsNumber(2)
                .setBoatName("Libra IV")
                .setCrewMember("Captain")
                .setCrewMember("Member #2")
                .setCrewMember("Member #3")
                .build();

        Sailboat sailboat2 = new Sailboat.SailboatBuilder()
                .setSailboatType("Cat boat")
                .setBoatLength(4)
                .setSailsNumber(1)
                .setBoatName("Orlando")
                .setCrewMember("Sailor")
                .build();

        // when
        int howManyCrewMembers = sailboat1.getCrew().size();
        int singleSailor = sailboat2.getCrew().size();


        // then
        Assert.assertEquals(3, howManyCrewMembers);
        System.out.println(sailboat1);
        Assert.assertTrue("true", singleSailor == 1);
        System.out.println(sailboat2);

    }
}
