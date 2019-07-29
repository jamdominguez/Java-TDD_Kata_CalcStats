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
    public void minValueMustBe11negativeWithInputNegativesAndRepeated() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{-4, -11, -3, -11, -5});
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

    @Test
    public void maxValueMustBe10NegativeWithInputNegativesAndRepeated() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{-50, -10, -20, -30, -40, -10});
        Assert.assertEquals(-10, calcStats.maxValue());
    }

    @Test
    public void sequenceIs1IfInputIs1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{1});
        Assert.assertEquals(1, calcStats.sequence());
    }

    @Test
    public void sequenceIs2IfInputIs0_1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 1});
        Assert.assertEquals(2, calcStats.sequence());
    }

    @Test
    public void sequenceIs5IfInputIs1Negative_0_1_2_3() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{-1, 0, 1, 2, 3});
        Assert.assertEquals(5, calcStats.sequence());
    }

    @Test
    public void averageIs0IfInputsAre0() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0});
        Assert.assertEquals(0f, calcStats.average(), 0);
    }

    @Test
    public void averageIs0IfInputsAre0_0_0() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 0, 0});
        Assert.assertEquals(0f, calcStats.average(), 0);
    }

    @Test
    public void averageIs1IfInputsAre1_1_1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{1, 1, 1});
        Assert.assertEquals(1f, calcStats.average(), 0);
    }

    @Test
    public void averageIs0With3IfInputsAre2_4() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{2, 4});
        Assert.assertEquals(3f, calcStats.average(), 0);
    }

    @Test
    public void averageIs0With5IfInputsAre0_1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{0, 1});
        Assert.assertEquals(0.5f, calcStats.average(), 0);
    }

    @Test
    public void averageIs2With5IfInputsAre4_1() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{4, 1});
        Assert.assertEquals(2.5f, calcStats.average(), 0);
    }

    @Test
    public void averageIs3With5IfInputsAre4_1Negative_4_2() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{4, -1, 4, 2});
        Assert.assertEquals(2.25f, calcStats.average(), 0);
    }

    @Test
    public void webTDDExample() throws Exception {
        CalcStats calcStats = new CalcStats(new int[]{6, 9, 15, -2, 92, 11});
        Assert.assertEquals(-2, calcStats.minValue());
        Assert.assertEquals(92, calcStats.maxValue());
        Assert.assertEquals(6, calcStats.sequence());
        Assert.assertEquals(21.833333f, calcStats.average(), 0.00001);
    }
}