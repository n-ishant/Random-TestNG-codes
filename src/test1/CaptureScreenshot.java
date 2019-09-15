package test1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class CaptureScreenshot {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com/install-apache-ant/");
		takeScreenshot("google");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)"); 
		
	}

	public static void takeScreenshot(String fileName) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File("E:\\Selenium Drivers\\" + fileName + ".png"));
		
		System.out.println("Screenshot Taken successfully");
	}
	
}
