package testNGLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class SampleTextFile {
	//The following are the predefined classes.
	File fc;
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;
	//The above are the predefined classes
	String src="C:\\sel\\workspace\\TstData.txt";
	@Test
	public void writeAndRead() throws IOException
	{
		fc=new File(src);
		//fc is an acronym of file class.
		//now write content to the new file.
		fc.createNewFile();
		fw=new FileWriter(src);
		bw=new BufferedWriter(fw);
		bw.write("This is my first Java Lesson.");
		bw.newLine();
		bw.write("This is my second Java Lesson.");
		bw.newLine();
		bw.write("This my third Java Lesson.");
		bw.close(); //close command saves file content and closes the file.
		//Now, the data I saved in the file is ready to be read it back.
		fr=new FileReader(src);
		br=new BufferedReader(fr);
		String content=null; //create a string variable called content stores null into it.
		while((content=br.readLine())!=null)
		{
			System.out.println(content);
		}
		br.close();
	}

}
