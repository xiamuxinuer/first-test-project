import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		System.out.println(" hi emma");
		
		// installing webdriver here:
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		// installing chromedrivier here:
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
	
		
		driver.close()	;	
		
		
		
		
		System.out.print("test ends");
		
		

	}

}
