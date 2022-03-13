import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void get(){
        WebDriverManager.edgedriver().setup();
        WebDriver web = new EdgeDriver();
        web.get("https://healthy.kaiserpermanente.org/front-door");
        System.out.println("Hello world");
    }
}
