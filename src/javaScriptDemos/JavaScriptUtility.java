package javaScriptDemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.yaml.snakeyaml.events.DocumentStartEvent;

public class JavaScriptUtility {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		List<WebElement> li=driver.findElements(By.tagName("demo-frame"));
		System.out.println(li.size());
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('tags').value='y'");
		
	}

}
