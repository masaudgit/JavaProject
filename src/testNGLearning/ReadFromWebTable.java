package testNGLearning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ReadFromWebTable {
	
	WebDriver driver; //declared the object "driver" as a global to be used throughout
	//in all the Methods/block codes.
	FileWriter fw;
	BufferedWriter bw;
	//the above are the variables which are the predefined classes in Java.
	//the below code is the path where i want to store the result/data/output into the
	//text file called "TestData" with the text file extension .txt
	//I provide the path where I am going to store the data, use predefined classes -
	//fw and bw to write the content, I don't want to create File Class (fc) because
	//the file already exists, I just reuse it.
	String src="C:\\sel\\workspace\\TestData.txt";
	@Test
	public void readFrmTable() throws IOException
	{
		//I need to create an object only for fw and bw object below
		fw=new FileWriter(src);
		bw=new BufferedWriter(fw);
		System.out.println("Launch W3Schools");
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//Now storing the web table info in WebElement called "mytbl" 
		WebElement mytbl=driver.findElement(By.id("customers"));
		//now, from the web table, i should focus on rows and columns
		//First let's store all the rows.
		//focus on all the web elements with the "tr" which TagName
		//and store them in the object called "allRows"
		List<WebElement> allRows=mytbl.findElements(By.tagName("tr"));
		//now let's count total number of rows
		System.out.println("total number of rows="+allRows.size());
		//use For loop, rows start with 1 because table data (<td>) starts from row 1, 
		//on row 0 is the table header or column header (<th>) which we don't want on row count
		for(int i=1;i<allRows.size();i++)
		{
			
			List<WebElement> allCols=allRows.get(i).findElements(By.tagName("td"));
			//now i have to focus on each and every column, so use for loop; start from 0
			//using "selectByIndex()" select method below, starts from 0
			//so, j=0 using NESTEAD FOR LOOP
			for(int j=0;j<allCols.size();j++)
			{
//				System.out.println(allcols.get(j).getText());//I am printing it on my console
				//now, we comment the above printing code for the purpose of writing the content into the text file
				bw.write(allCols.get(j).getText());
				//now,I want to write each content in new line
				bw.newLine();
			}
		}
		bw.close(); // it saves the content and close
			driver.quit();
		
	}

}


