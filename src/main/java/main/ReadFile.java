package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	
	public static String readFileToString(String path )throws IOException{
		String result = "";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line;
			while((line=br.readLine())!= null) {
				result +=line+" ";
				// System.out.println(line);
			
			} }
		catch (IOException e) {
				e.printStackTrace();
			}
		return result;
	
	}
	
	public static int givenumberofRows(String path)throws IOException{
		int result =0;
		

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line;
			while((line=br.readLine())!= null) {
				result ++;
				// System.out.println(line);
			
			} }
		catch (IOException e) {
				e.printStackTrace();
			}
	
	
	return result;
	}
}
