import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {
    @Test(dataProvider = "test1")
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("The name is " + myName);
    }
    @DataProvider(name = "test1")
    public static Object[] names(){
        return new Object[]{
                "ivan", "Dimitar", "Stefan"

        };


    }
}

