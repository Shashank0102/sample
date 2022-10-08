package project1;
import java.util.*;
import java.io.*;

public class source_code {
	static final String ProjectPath="C:\\Users\\kanna\\Desktop\\project simplilearn\\project1\\src\\project1";
	public static void main(String[] args) throws IOException {
		Scanner obj=new Scanner(System.in);
		int choice;
		do {
			showmenu();
			System.out.println("eneter your preference");
			choice = Integer.parseInt(obj.nextLine());
			switch(choice)
			{
			case 1:getallfiles();
			break;
			case 2:createfiles();
			break;
			case 3:deletefiles();
			break;
			case 4:searchallfiles();
			break;
			case 5:System.exit(0);
			break;
			default:System.out.println("invalid input");
			break;
			
			}
			obj.next();
		}while(choice>0);
		
			
			
		}
	public static void showmenu() {
		System.out.println("Name:shashank.b\t\t");
		System.out.println("1 To display all the files");
		System.out.println("2.Adding files to the existing directory");
		System.out.println("3.Deleting the file");
		System.out.println("4.Searching the file");
		System.out.println("5.Exit");
		System.out.println("the end");
		
	}
	public static void searchallfiles() {
		Scanner obj=new Scanner(System.in);
		try {
			String filename;
			System.out.println("enetr the name of the file to be searched");
			filename=obj.nextLine();
			File filename1=new File(ProjectPath+"\\"+filename);
			if(filename1.exists()) {
				System.out.println("file is succesfully searched");
				
			}
			else {
				System.out.println("fiel is not present");
			}
		} catch (Exception e) {System.out.println("error occured");		}
		
		
	}
	public static void deletefiles() {
		Scanner obj=new Scanner(System.in);
		try {
			String filename;
			System.out.println("enter filenmae to delete");
			filename=obj.nextLine();
			File filename1=new File(ProjectPath+"\\"+filename);
			if(filename1.exists()) {
				filename1.delete();
				System.out.println("file deleted");
			}
			else {
				System.out.println("file not found");
			}
			
		} catch (Exception e) {System.out.println("please check for any error");		}
		
	}
	public static void createfiles() throws IOException{
		try {
			Scanner obj=new Scanner(System.in);
			String filename;
			int linecount;
			System.out.println("enter the filename");
			filename=obj.nextLine();
			System.out.println("enter the no of lines of content to write");
			linecount=Integer.parseInt(obj.nextLine());
			FileWriter filewriter=new FileWriter(ProjectPath+"\\"+filename);
			
			  for(int i = 0;i<=linecount;i++) {
				  System.out.println("enter content");
				  filewriter.write(obj.nextLine()+"\n");
				  
			  }
			  System.out.println("file was created");
			  filewriter.close();		
		}
		catch(Exception ex){
			System.out.println("please check the input given ");
		}
		
	}
	public static void getallfiles() {
		File[] listofnames=new File(ProjectPath).listFiles();
		if(listofnames.length==0) {
			System.out.println("no files availabe");
		}
		else {
			for(File name:listofnames) {
				System.out.println(name.getName());
			}
		}
		
	}
	

}
