import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

public class SampleTest {
    @Test
    public void get(){
        WebDriverManager.edgedriver().setup();
        WebDriver  driver= new EdgeDriver();
        driver.get("https://outlook.live.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.quit();
    }
}
