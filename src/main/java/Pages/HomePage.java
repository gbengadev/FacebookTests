package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private By createPostField= By.cssSelector(".gy2v8mqq > .a8c37x1j");
    private By textArea=By.cssSelector("._1mf");
    private By postButton= By.xpath("//div[@class='k4urcfbm discj3wi dati1w0a hv4rvrfc i1fnvgqd j83agx80 rq0escxv bp9cbjyn']//div[@class='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4']");


    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void createPost(String message) throws InterruptedException {
        Thread.sleep(6000);
        //Dismiss notification
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE);
        driver.findElement(createPostField).click();
        driver.findElement(textArea).sendKeys(message);
        driver.findElement(postButton).click();
    }
}
