import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// installing web driver here:
				System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
				
				// installing chrome driver here:
				ChromeDriver driver = new ChromeDriver();
				
				
				
				driver.get("https://oucmsqa.oscn.net");
				
				System.out.println("opening oucms home login page");
				driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div/ul/li/a")).click();
				driver.findElement(By.id("userNameInput")).sendKeys("Emma.Xiaogaiti@oscn.net");
				driver.findElement(By.id("passwordInput")).sendKeys("Abcd1234!");
				
				
				driver.findElement(By.id("submitButton")).click();
				
				//driver.close();
				
				System.out.print("test ends");
				
    
		
	}

}
