import org.junit.Assert;
import org.junit.Test;

public class CalcStatsTest {

    @Test
    public void calcStatsConstructWithIntArray() throws Exception {
        int[] nums = {0, 1, 2, 3};
        CalcStats calcStats = new CalcStats(nums);
        Assert.assertEquals(true, calcStats instanceof CalcStats);

        calcStats = new CalcStats(new int[]{4, 5, 6});
        Assert.assertEquals(true, calcStats instanceof CalcStats);
    }

    @Test(expected = Exception.class)
    public void nullInputProducesException() throws Exception {
        CalcStats calcStats = new CalcStats(null);
    }

    @Test(expected = Exception.class)
    public void emptyArrayInputProducesException() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{});
    }

    @Test
    public void minValueMustBe0WithInput0() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0});
        Assert.assertEquals(0, calcStats.minValue());
    }

    @Test
    public void minValueMustBe0WithInput0_1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 1});
        Assert.assertEquals(0, calcStats.minValue());
    }

    @Test
    public void minValueMustBe1WithInput1_2() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{1, 2});
        Assert.assertEquals(1, calcStats.minValue());
    }

    @Test
    public void minValueMustBe1WithInput1_2_3_4() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{1, 2, 3, 4});
        Assert.assertEquals(1, calcStats.minValue());
    }

    @Test
    public void minValueMustBe1WithInput4_3_2_1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{4, 3, 2, 1});
        Assert.assertEquals(1, calcStats.minValue());
    }

    @Test
    public void minValueMustBe1WithInput4_1_3_2_5() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{4, 1, 3, 2, 5});
        Assert.assertEquals(1, calcStats.minValue());
    }

    @Test
    public void minValueMustBe1negativeWithInput4_1negative_3_2_5() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{4, -1, 3, 2, 5});
        Assert.assertEquals(-1, calcStats.minValue());
    }

    @Test
    public void minValueMustBe11negativeWithInputNegatives() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{-4, -1, -3, -11, -5});
        Assert.assertEquals(-11, calcStats.minValue());
    }

    @Test
    public void maxValueMustBe0WithInput0() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0});
        Assert.assertEquals(0, calcStats.maxValue());
    }

    @Test
    public void maxValueMustBe10WithInput0_10() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 10});
        Assert.assertEquals(10, calcStats.maxValue());
    }

    @Test
    public void maxValueMustBe10WithInput0_1_2_3_4_5_10() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 1, 2, 3, 4, 5, 10});
        Assert.assertEquals(10, calcStats.maxValue());
    }

    @Test
    public void maxValueMustBe10WithInput0_1_2_10_3_4_5() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 1, 2, 10, 3, 4, 5});
        Assert.assertEquals(10, calcStats.maxValue());
    }

    @Test
    public void maxValueMustBe0WithInputNegatives() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{-5, -1, -2, 0, -3, -4, -5});
        Assert.assertEquals(0, calcStats.maxValue());
    }

    @Test
    public void maxValueMustBe10NegativeWithInputNegatives() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{-50, -10, -20, -30, -40, -100});
        Assert.assertEquals(-10, calcStats.maxValue());
    }

}