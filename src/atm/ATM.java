package atm;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		double balance=1000;
		String user="caglayan";
		String userPassword="123321";
	
		System.out.println("Please enter your information...");
		System.out.println();
		System.out.print("Enter your username:");
		String username=scan.next();
		System.out.print("Enter your password:");
		String password=scan.next();
		
		if(username.equals(user) && password.equals(userPassword)) {
			System.out.println("Çağlayan Irmak account has been logged in.");
		    System.out.println();
		System.out.println("Select 1 for Check Balance.");
		System.out.println("Select 2 for Withdraw.");
		System.out.println("Select 3 for Deposit.");
		System.out.println("Select 0 for Exit.");
		System.out.print("Select option you want to perform: ");
		
		int number=scan.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("Your balance: "+balance);
			break;
		case 2:
			System.out.print("Enter the amount to be withdraw: ");
			int w=scan.nextInt();
			System.out.println();
			if(w>balance) {
				System.out.println("The amount to be withdraw cannot be greater than the balance!!");
			}
			else {
			balance -= w ;
			System.out.println("Current balance: "+balance);
			}
			break;
		case 3:
			System.out.print("Enter the amount to be deposit: ");
			int d=scan.nextInt();
			System.out.println();
			balance += d;
			System.out.println("Current balance: "+balance);
			break;
		case 0:
			System.out.println();
			System.out.println("Exiting the system.");
			System.exit(0);
			break;
		default:
            System.out.println("Invalid option. Please try again.");
		}
	}  
		else {
			System.out.println();
			System.out.println("Your information is incorrect. Please try again.");
			}
	scan.close();
	}
		
	}


