
import org.testng.annotations.*;

public class TestNg {
    // test case 1
    @Test(groups = {"Smoke tests"})
    public void testCase1() {
        System.out.println("in test case 1");
    }
    @Test(groups = {"Functional test"})
    // test case 2

    public void testCase2() {
        System.out.println("in test case 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }





}
