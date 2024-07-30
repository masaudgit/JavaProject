package selWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		String alrtText=driver.switchTo().alert().getText();//Now, I have to tell selenium to switch to this alert
		System.out.println(alrtText);
		driver.switchTo().alert().sendKeys("Riya");//selenium replaced Harry Potter with Riya
		driver.switchTo().alert().accept();//accept used for ok button
		Thread.sleep(5000);
		driver.quit();
		

	}

}
