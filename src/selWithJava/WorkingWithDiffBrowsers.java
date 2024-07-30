package selWithJava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDiffBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
		ArrayList<String> exp_Data = new ArrayList<String>();
		exp_Data.add("Days");
		exp_Data.add("Months");
		exp_Data.add("Years");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("title="+title);
		if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			System.out.println("Title Matched...");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("200000");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
			//code for drop down
			Select opts=new Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown")));
			opts.selectByVisibleText("Days");
			List<WebElement> allItems=opts.getOptions();
			System.out.println("Total Items = "+allItems.size());
			for(int i=0;i<allItems.size();i++)
			{
				System.out.println(allItems.get(i).getText());
				//write if statement to compare expected data to actual data
				if(exp_Data.get(i).equals(allItems.get(i).getText()))
				{
					System.out.println("Item Matched...");
				}
				else
				{
					System.out.println("Item Not Matched...");
				}
			}
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("6.50");
			//write the code for another drop down box.
			WebElement ele=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FrequencyDropDown"));
			Select opts1=new Select(ele);
			opts1.selectByVisibleText("Annual");
			List<WebElement> allItems1=opts1.getOptions();
			System.out.println("Total Items="+allItems1.size());
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnFDMAmount")).click();
			Thread.sleep(4000);
			String fd_Amount=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox")).getAttribute("value");
			System.out.println("FD Amount="+fd_Amount);
		}
		else
		{
			System.out.println("Title not Matched...");
		}
		driver.quit();

	}

}
