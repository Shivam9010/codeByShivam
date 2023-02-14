package rahulSir2frame;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CheakDevIMistick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
	ChromeOptions op=	new ChromeOptions();

		WebDriver driver = new ChromeDriver(op);
		driver.get("http:localhost:8888");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("221406");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		String pagesco = driver.getPageSource();
		
		System.out.println(pagesco);
//	String a=	pagesco.toString();
		driver.get("https://validator.w3.org/#validate_by_input");
		
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        ((JavascriptExecutor) driver).executeScript(mouseOverScript,
                 driver.findElement(By.id("fragment")));	 
		 Thread.sleep(2000);
		 //sendtext.sendKeys(a);
			WebElement sendtext = driver.findElement(By.xpath("//textarea[@id='fragment']"));
//			

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('fragment').value='shivam'");
		


 
 
 
	}
}

//sendtext.sendKeys(pagesco);
//JavascriptExecutor js=(JavascriptExecutor)driver;
//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//String a="jjj";
//js.executeScript("arguments[0].value='"+abc+"';", sendtext);