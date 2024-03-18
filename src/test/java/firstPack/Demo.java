package firstPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		System.out.println("Shankar has completed his work");
		System.out.println("Shankar has completed his work add abranch");
		
		
	}

}
