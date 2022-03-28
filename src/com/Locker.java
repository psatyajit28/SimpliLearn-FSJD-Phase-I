//Company Lockers.com Project
//Developer Satyajeet Patil
//File Name:-Locker.java

package com;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Locker {
    	private static Scanner sc;
    	public static void main(String[] args) throws IOException {
    	int ch,op;
    	sc = new Scanner(System.in);
    	String path="E:\\Company Locker\\";
    	System.out.println("********************Welcome to LokedMe.com*************************");
    	System.out.println("********************Developer : Satyajeet Patil*************************");
    	do
    	{
    	System.out.println("Menu");
    	System.out.println("1)Display File Name\n2)Add, Delete or Search the File\n3)Exit");
    	ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
    		File f3=new File(path);
    		File fileng[]=f3.listFiles();
    		if(fileng.length==0)
			{
				System.out.println("Directory is Empty. Please Add File");
			}
    		for(File ff:fileng) {
    			
    	
    				System.out.println(ff);
    		}
    		break;
    	case 2:
    		do 
    		{
    		System.out.println("Enter your choice:");
    		System.out.println("\n \t1)Add a file \n\t2)Delete the file \n\t3)Search the file \n\t4)Return to Main Menu");
    		op=sc.nextInt();
    		
    		switch(op)
    		{
    		
    			case 1:
				    		ArrayList<String> al=new ArrayList<>();
				    		System.out.println("Enter the file name");
				    		String filename=sc.next();
				    		String finalfile=path+filename;
				    		File f=new File(finalfile);	
				    		boolean res=f.createNewFile();
				    		if(res==false) {
				    			System.out.println("file not created");
				    		}
				    		else {
				    			al.add(filename);
				    			System.out.println("file is created");
				    		}
				    		System.out.println(al);
		   		break;
		    	case 2:	
				    		System.out.println("Enter the name of a file to be deleted");
				    		String filedel=sc.next();
				    		String delfile=path+filedel;
				    		File f2=new File(delfile);
				    		f2.delete();
		        break;
		    	
		    	case 3:
				    		File f1=new File(path);
				    		System.out.println("enter the file name");
				    		String filesearch=sc.next();
				    		File filen[]=f1.listFiles();
				    		int flag=0;
				    		for(File ff:filen) {
				    			if(ff.getName().equals(filesearch)) {
				    				flag=1;
				    				break;
				    			}
				    			else {
				    				flag=0;
				    			}
				    		}
				    		if(flag==1) {
				    			System.out.println("file is found");
				    		}
				    		else {
				    			System.out.println("file is not found");
				    		}
				             break;
		    	//case 4:
			            	//System.exit(0);
			            	//break;
		    	default:
			            	// System.out.println("Check the option and retry");
			            	break;
		    		}
    		}while(op!=4);
    	case 3:
    		//System.exit(0);
    		
    		default:
       	      // System.out.println("check the option and retry");
       	    break;
    		
    	}
  }while(ch!=3);
  }
}

