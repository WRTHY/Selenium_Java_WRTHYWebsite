import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//current version of chrome is 110
	
		driver.get("https://www.wrthymusic.com/");
		
	}
}
