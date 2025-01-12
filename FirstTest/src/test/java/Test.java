import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/* 
 Test case
 ---------
 
 1) Launch browser (chrome)
 2) Open URL https://demo.opencart.com/
 3) Validate title should be "Your Store"
 4) close browser
 */



public class Test {

	public static void main(String[] args) {
		
		//1) Launch browser (chrome)
				ChromeDriver driver=new ChromeDriver();
			
			//2) Open URL https://demo.opencart.com/
				driver.get("https://demo.opencart.com/");
				
			//3)  Validate title should be "Your Store"
				String actual_title=driver.getTitle();
				
				if(actual_title.equals("Your Store"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
				
			//4) close browser
				driver.quit();

	}

}
