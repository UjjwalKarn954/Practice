import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class   AddressBookTxtfile{
	static String firstname;
	static String lastname;
	static String mobnum;
	static String address;
	static String emailid;
	public   AddressBookTxtfile(String firstname,String lastname,String mobnum,String address,String emailid) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.mobnum=mobnum;
		this.address=address;
		this.emailid=emailid;
	}
	
	
		
	



	public static void main(String args[])throws Exception {
		Scanner scan=new Scanner(System.in);
		int choice;
		
		
		
		System.out.println("Enter your choice");
		System.out.println("1 To Write to file");
		System.out.println("2 To Read  file");
		System.out.println("3 To Delete from  file");
		System.out.println("4 To Search from file");
		System.out.println("5 To Sort file");
		System.out.println("6 To Edit to file");
		System.out.println("7 To Exit");
		while(true) {
			int query=scan.nextInt();
			switch(query) {
			case 1:
				System.out.println("Enter the num of entries u want to make");
				int n=scan.nextInt();
				for(int i=0;i<n;i++) {
					
	
				System.out.println("Firstname  Lastname  Mobilenum  Address  EmailId");
				String Fname=scan.next();
				String lname=scan.next();
				String mobnum=scan.next();
				String add=scan.next();
				String eid=scan.next();
				File f =new File("C:\\Users\\Ujjwal Karn\\Cars.txt");
				if(f.exists()) {
				FileWriter fw=new FileWriter("C:\\Users\\Ujjwal Karn\\Cars.txt",true);
				fw.write(" "+Fname+" "+lname+" "+mobnum+" "+add+" "+eid+System.lineSeparator());	
				fw.close();
				}else {
					FileWriter fw=new FileWriter("C:\\Users\\Ujjwal Karn\\Cars.txt");
					fw.write(" "+Fname+" "+lname+" "+mobnum+" "+add+" "+eid+System.lineSeparator());	
					fw.close();}
				}
				break;
				
			case 2:
				
			
				
						FileReader fr=new FileReader("C:\\Users\\Ujjwal Karn\\Cars.txt");
						BufferedReader br=new BufferedReader(fr);
						String line;
						
						while((line=br.readLine())!=null) {
							
							System.out.println(line);
						}
						
			
				
					break;
			case 3:
				
				ArrayList<String> list=new ArrayList();
				String line1;
				while((line1=br.readLine())!=null) {
				list.add(line1);	
				}
				System.out.println("Enter the name u wantt to delete from list");
				String name=scan.next();
				for(int i=0;i<list.size();i++) {
					if(name.equals(list.get(i).split(" ")[0])) {
					list.remove(i);
					}
				}
				break;
			case 4:
					
				String line2;
				
				while((line2=br.readLine())!=null) {
				
             	list.add(line2);	
				}
     			System.out.println("Enter the name u wantt to search from list");
       			String aname=scan.next();
				for(int i=0;i<list.size();i++) {
					if(aname.equals(list.get(i).split(" ")[0])) {
					list.get(i);
					}
				}
				
				
				}
			
			
			}

	}

}
