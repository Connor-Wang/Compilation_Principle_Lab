package Lexical_Analysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {

	StringBuffer strbuf = new StringBuffer();
	
	public Read_File(String filename){
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String temp = null;
			while ((temp = br.readLine()) != null) {
				strbuf.append(temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Դ�ļ�δ�ҵ���");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("��д�ļ��쳣��");
			e.printStackTrace();
		}
	}
}