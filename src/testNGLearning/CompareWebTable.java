package testNGLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

//we read actual data and store it in some object and store it in such a way that we
//can focus on each and every index value, so exp data can be compared with act data.
//the object can be referred to an index.
//created this class because I am asked to test actual web table content
//so,i have written data to the text file, that is my expected data, now
//compare expected data with actual web table content, for that, I need to create
//two Array Lists; one for expected data and one for actual data. Let's do it

public class CompareWebTable {

//this will be expected data code Method
//after reading the data, I have to store it in some object, so store it in Array List
//the objects are "exp-data" and "act_data" to store data in it
	ArrayList<String> exp_data=new ArrayList<String>();
	ArrayList<String> act_data=new ArrayList<String>();
	//create objects first must declare them
	FileReader fr;
	BufferedReader br;
	WebDriver driver;//declared the object "driver" as a global to be used throughout
	//in all the Methods/block codes.
	String src="C:\\sel\\workspace\\TestData.txt";
	@Test(priority=1)
	public void readDataFrmWebTbl()//this is a method or a block of the code
	{
		//The below code copied from "ReadFromWebTable" and going to edit it.
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//Now storing the web table info in WebElement called "mytbl" 
		WebElement mytbl=driver.findElement(By.id("customers"));
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
		        act_data.add(allCols.get(j).getText()); //this is going to store all data
		        //in this "act_data" variable.
			}

		}
		System.out.println("Actual Data="+act_data.size());
		
		
	}
	//this is my second Method to READ data from text file stored in Notepad
	//while reading the data from text file, i have to use classes of data -
	//FileReader (fr) and BufferedReader (br) and use While loop code as well
	@Test(priority=2)
	public void readFrmTxtFile() throws IOException
	{
		fr=new FileReader(src);
		br=new BufferedReader(fr);
		String content=null;
		while ((content=br.readLine())!=null)
		{
			exp_data.add(content);//so all the data is stored in this expected data
			
			//we are comparing the data values in the two Array Lists,
			//I will create one more method
		}
		System.out.println("Expected Data="+exp_data.size());
	}
	@Test(priority=3)
	public void compareData()
	{
		//I have to use For loop since I have to compare each and every row from zero(0) location
		for (int i=0;i<exp_data.size();i++) {
			
			System.out.println(exp_data.get(i)+"\t"+act_data.get(i));
			if(exp_data.get(i).equals(act_data.get(i))) {
				//System.out.println("Item matched...");//sysout displays output only
				//in the output console
				//but i want to print the output in report.So for that use following code
				Reporter.log("Item Matched...");//this is used for display 
				//output in the report window
			}
			else
			{
				//System.out.println("Item not matched...");
				Reporter.log("Item not Matched...");
			}
		}
	}
	
}
