package Basics;
import java.util.*;
import java.util.Scanner;

class BookDetails{
	String firstname;
	String lastname;
	String phonenum;
	String address;
	String emailaddress; 
	
  public BookDetails(String firstname, String lastname, String phonenum, String address, String emailaddress) {
	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.phonenum=phonenum;
	  this.address=address;
	  this.emailaddress=emailaddress;
	  
  }
}
public class AddressBook {
	public static void main(String rgs[]) {
		Scanner scan=new Scanner(System.in);
		
	
		ArrayList<BookDetails> list=new ArrayList<BookDetails>();
		
		while(true) {
			
			System.out.println("Enter yes if you want to work with Addressbook and no if u dont");
			String Query=scan.next();
			if(Query.equals("yes")) {
				System.out.println("Select 1 to add entries");
				System.out.println("Select 2 to remove entries");
				System.out.println("Select 3 to read entries");
				System.out.println("Select 4 to sort entries");
			
			
			int choice=scan.nextInt();
			switch(choice){
			case 1:
				System.out.println("Bookfname booklname phonenum address emailaddress");
				String bookFname=scan.next();
				String booklname=scan.next();
				String phonenum=scan.next();
				String address=scan.next();
				String emailaddress=scan.next();
				list.add(new BookDetails(bookFname, booklname ,phonenum ,address ,emailaddress));
				
				break;
			case 2:
				System.out.println("remove the Book  with firstname");
				String Firstname=scan.next();
				for(int i=0;i<list.size();i++) {
					if(Firstname.equals(list.get(i).firstname)) {
						list.remove(i);
						
					}
				}
				break;
			case 3:
			    System.out.println("The enters are");
			    for(BookDetails d: list) {
			    	System.out.println(" "+d.firstname+" "+d.lastname+" "+d.address+" "+d.phonenum+" "+d.emailaddress);
			    }
			    	break;
			    
			case 4:
				System.out.println("enter firstname to sort the addressbook");
				String sortword=scan.next();
				for(int i=0;i<list.size();i++) {
					if(sortword.equals(list.get(i).firstname)) {
						System.out.println(list.get(i).firstname+" "+list.get(i).lastname+" "+list.get(i).phonenum);
						
					}
				}
				break;
			}
				
			}else {
				System.out.println("thank you");
				break;
			}
			
			
		}
		
	}


}
