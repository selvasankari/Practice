package com.chella.practice.filehandling;

import java.io.*;

public class FileHandling {
	
	public static void main(String args[])
	{
		File file= new File("C:/data");
		//To get the folder names in the given folder
		String[] fileList = file.list();
		for(String f : fileList)
		{
			System.out.println(f);
		}
		
		//To get the file objects from a folder in java
		 File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	        }
	
		
	}

}
