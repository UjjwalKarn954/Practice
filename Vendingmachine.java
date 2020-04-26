package Vending;

import java.util.Scanner;

public class MachineVending {
	static int total;
	static int n;
	static int balance;
	static Scanner scan=new Scanner (System.in);

	public static void selection() {

		
		
		System.out.println("Select Your choice");
		System.out.println("1 for Candy()");
		System.out.println("2 for Snack");
		System.out.println("3 for Nuts");
		System.out.println("4 for Coke");
		System.out.println("5 for Pepsi");
		System.out.println("6 for Soda");
		System.out.println("7 to Exit");
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			if(balance>=10) {
				
			System.out.println("Collect Cnady");
			balance=balance-10;
			}
			else {
				System.out.println("Not enough money ");
				
			}
			break;
		case 2:
			if(balance>=50) {
				
				System.out.println("Collect Snsack ");
				balance=balance-50;
				}
				else {
					System.out.println("Not enough money ");
					
				}
			break;
		case 3:
                 if(balance>=90) {
				
				System.out.println("Collect Nuts ");
				balance=balance-90;
				}
				else {
					System.out.println("Not enough money ");
					
				}
			break;
		case 4:
                if(balance>=25) {
				
				System.out.println("Collect Coke");
				balance=balance-25;
				}
				else {
					System.out.println("Not enough money ");
					
				}
                break;
		case 5:
                if(balance>=35) {
				
				System.out.println("Collect pepsi ");
				balance=balance-35;
				}
				else {
					System.out.println("Not enough money ");
					
				}
                break;
		case 6:
                if(balance>=45) {
				
				System.out.println("Collect Soda ");
				balance=balance-45;
				}
				else {
					System.out.println("Not enough money ");
					
				}
                break;
		case 7:
			n=n-balance;
			System.out.println("collect your cash " +balance);
			balance=0;
			break;
			}
	}
	
	public static void main(String args[]) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Welcome");
		int cent=1;
		int penny=5;
		int nickel=10;
		int dime=25;
		int quater=50;
		int doller =100;
		while(true) {
			System.out.println("insert Cash");
			 n=scan.nextInt();
			 total=0;
			
			if(n==1 || n==5 || n==10 || n==25 ||n==50 || n==100)
				{ 
				total=total+n;
				balance=n;
			
				selection();
				
				
				}else {
					System.out.println("Cant accept Please try again");
					break;
				}
			if(balance>0) {
				
				System.out.println("You have balance remaining in account select if u want to buy more "+balance);
				selection();
			}else {
				System.out.println("You dont have enough money");
				balance=0;
			}
		
			}
	
		
	}

}
