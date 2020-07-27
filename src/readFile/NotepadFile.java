package readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotepadFile {

	public static void main(String[] args) throws IOException {
		String fpath = "D:\\sanju_Programs\\Read.txt";
		FileReader f = new FileReader(fpath);
		BufferedReader bf = new BufferedReader(f);
		
		String startLine;
		while((startLine = bf.readLine()) != null)
		{
			System.out.println(startLine);
		}

	}

}
