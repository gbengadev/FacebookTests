import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTests{

    String message= "Hello World";

    @Test
    public void createPost() throws InterruptedException {
        homePage.createPost(message);
    }
}
