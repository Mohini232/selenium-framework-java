package com.dyanyog.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadCSV {

	public static void main(String args[]) throws IOException {
		String csvFile = "C:\\Selenium\\read.csv";
		BufferedReader br = null;
		String line = "";
		// String csvSplitBy = ",";

		//try {
			FileReader fr = new FileReader(csvFile); // Copy file from HD to RAM
			br = new BufferedReader(fr); // Read file from RAM
			while ((line = br.readLine()) != null) {
				// String[] country = line.split(csvSplitBy);
				System.out.println(line);
			}
			br.close();
		//} catch (Exception e) {
			//e.printStackTrace();
		//}
		System.out.println("After catch block");
	}

}
