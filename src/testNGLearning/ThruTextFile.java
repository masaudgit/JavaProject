package testNGLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class ThruTextFile {
	
	File fc;
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	BufferedWriter bw;
	//the above are the variables which are the predefined classes in Java.
	String src="C:\\sel\\workspace\\TestData.txt";//this is the path where you create this file.
	@Test
	public void writeAndReadData() throws IOException
	{
		fc=new File(src);
		fc.createNewFile(); //write content to the file
		fw=new FileWriter(src);
		bw=new BufferedWriter(fw);
		bw.write("This is my first line");
		bw.newLine();
		bw.write("This is my second line");
		bw.close();//this code saves the content and close the file.
		//Now, the data I saved, I want to read it back.
		fr=new FileReader(src);
		br=new BufferedReader(fr);
		//now I am creating a string variable called content which stores "null" into it.
		String content=null;
		while((content=br.readLine())!=null)
		{
			System.out.println(content);
		}
		br.close(); //it closes the file.
		
	}
}
