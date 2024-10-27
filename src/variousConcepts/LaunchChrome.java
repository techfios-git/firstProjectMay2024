package variousConcepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome {
	
	//Java is associated with:			//Class is associated with:
	//Classes							//Variables /Attributes  /Fields
	//Objects							//Methods
	
	public static void main(String[] args) {
		
		System.out.println("First Selenium");
//		Scanner scn = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://codefios.com/ebilling/ ");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		
		driver.close();
		
		
	}
	
	
	
	
	

}
