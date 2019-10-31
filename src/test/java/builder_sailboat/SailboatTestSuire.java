package builder_sailboat;

import org.junit.Assert;
import org.junit.Test;

public class SailboatTestSuire {
    @Test
    public void testSailboatNew() {
        // given
        Sailboat sailboat1 = new Sailboat.SailboatBuilder()
                .setSailboatTyoe("Cutter")
                .setBoatLenght(6)
                .setSailsNumber(2)
                .setCrewMember("Captain")
                .setCrewMember("Member #2")
                .setCrewMember("Member #3")
                .build();

        Sailboat sailboat2 = new Sailboat.SailboatBuilder()
                .setSailboatTyoe("Cat boat")
                .setBoatLenght(4)
                .setSailsNumber(1)
                .setCrewMember("Sailor")
                .build();

        // when
        int howManyCrewMembers = sailboat1.getCrew().size();

        // then
        Assert.assertEquals(3, howManyCrewMembers);
        System.out.println(sailboat1);

    }
}
