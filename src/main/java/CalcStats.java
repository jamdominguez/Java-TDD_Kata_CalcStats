public class CalcStats {

    private int[] nums;

    public CalcStats(int[] nums) throws Exception {
        if (nums == null) throw new Exception("Input is null, not is possible calculate stats from this input");
        if (nums.length == 0) throw new Exception("Input is null, not is possible calculate stats from this input");
        this.nums = nums;
    }

    public int minValue() {
        int min = this.nums[0];
        for (int i = 1; i < nums.length; i++) if (nums[i] < min) min = nums[i];
        return min;
    }
}
