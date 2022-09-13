import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    @Test
    public void test001(){
        startHomePage();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
