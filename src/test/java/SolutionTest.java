import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findPeakElementTest1() {
        int[] nums = {1, 2, 3, 1};
        int expected = 2;
        int actual = new Solution().findPeakElement(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPeakElementTest2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int expected = 5;
        int actual = new Solution().findPeakElement(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPeakElementTest3() {
        int[] nums = {1};
        int expected = 0;
        int actual = new Solution().findPeakElement(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPeakElementTest4() {
        int[] nums = {1,2};
        int expected = 1;
        int actual = new Solution().findPeakElement(nums);

        Assert.assertEquals(expected, actual);
    }
}
