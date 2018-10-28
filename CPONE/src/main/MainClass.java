package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MTO\\Downloads\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		String ActualPageTitle = "";
		
		ActualPageTitle = driver.getTitle();
		
		System.out.println(ActualPageTitle);
		
		
		
		driver.close();
		driver.quit();
		
	}

}
