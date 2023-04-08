package junit4_assignment;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testReverseWithNonEmptyString() {
        String actual = StringUtils.reverse("hello");
        String expected = "olleh";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseWithEmptyString() {
        String actual = StringUtils.reverse("");
        String expected = "";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmptyWithNonEmptyString() {
        boolean actual = StringUtils.isEmpty("hello");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmptyWithEmptyString() {
        boolean actual = StringUtils.isEmpty("");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindromeWithPalindromeString() {
        boolean actual = StringUtils.isPalindrome("racecar");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        boolean actual = StringUtils.isPalindrome("hello");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}
