import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class SILab2Test {

    @Test
    public void testEveryBranchCriterion() {
        // Test cases based on the Every Branch criterion
        // Test case 1: user is null
        User user1 = null;
        List<User> allUsers1 = new ArrayList<>();
        try {
            SILab2.function(user1, allUsers1);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 2: user's password is null
        User user2 = new User("testuser", null, "test@example.com");
        List<User> allUsers2 = new ArrayList<>();
        try {
            SILab2.function(user2, allUsers2);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 3: user's email is null
        User user3 = new User("testuser", "password123", null);
        List<User> allUsers3 = new ArrayList<>();
        try {
            SILab2.function(user3, allUsers3);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 4: user's username is null
        User user4 = new User(null, "password123", "test@example.com");
        List<User> allUsers4 = new ArrayList<>();
        SILab2.function(user4, allUsers4);
        Assert.assertEquals("test@example.com", user4.getUsername());

        // ... add more test cases based on the Every Branch criterion
    }

    @Test
    public void testMultipleConditionCriterion() {
        // Test cases based on the Multiple Condition criterion
        // Test case 1: user is null
        User user1 = null;
        List<User> allUsers1 = new ArrayList<>();
        try {
            SILab2.function(user1, allUsers1);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 2: user's password is null
        User user2 = new User("testuser", null, "test@example.com");
        List<User> allUsers2 = new ArrayList<>();
        try {
            SILab2.function(user2, allUsers2);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 3: user's email is null
        User user3 = new User("testuser", "password123", null);
        List<User> allUsers3 = new ArrayList<>();
        try {
            SILab2.function(user3, allUsers3);
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 4: user's password contains the username in lowercase
        User user4 = new User("testuser", "password123", "test@example.com");
        List<User> allUsers4 = new ArrayList<>();
        boolean result4 = SILab2.function(user4, allUsers4);
        Assert.assertFalse(result4);
