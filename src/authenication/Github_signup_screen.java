package authenication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_signup_screen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String testemail="raniadahnoun@yahoo.com";
		String testpass="12345678";
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")) .sendKeys(testemail);
		driver.findElement(By.id("pass")) .sendKeys(testpass);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
	}

}
