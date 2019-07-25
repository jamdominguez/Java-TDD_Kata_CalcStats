import org.junit.Assert;
import org.junit.Test;

public class CalcStatsTest {

    @Test
    public void calcStatsConstructWithIntArray() {
        int[] nums = {0, 1, 2, 3};
        CalcStats calcStats = new CalcStats(nums);
        Assert.assertEquals(true, calcStats instanceof  CalcStats);

        calcStats = new CalcStats(new int[]{4, 5, 6});
        Assert.assertEquals(true, calcStats instanceof  CalcStats);
    }
}