	import java.util.*;
public class A {


	//class BankAccount {
		static Scanner input = new Scanner(System.in);
		String name, actype;
		int accNo, bal, amt;

		A(String name, int accNo, String actype, int bal) {
			this.name = name;
			this.accNo = accNo;
			this.actype = actype;
			this.bal = bal;
		}

		int deposit() {
			System.out.print("Enter amount to deposit:");
			amt = input.nextInt();
			if (amt < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			bal = bal + amt;
			return 0;
		}

		int withdraw() {
			System.out.println("Your Balance=" + bal);
			System.out.print("Enter amount to withdraw:");
			amt = input.nextInt();
			if (bal < amt) {
				System.out.println("Not sufficient balance.");
				return 1;
			}
			if (amt < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			bal = bal - amt;
			return 0;
		}

		void display() {
			System.out.println("Name:" + name);
			System.out.println("Account No:" + accNo);
			System.out.println("Balance:" + bal);

		}

		void dbal() {
			System.out.println("Balance:" + bal);
		}

		public static void main(String args[]) {
			System.out.println("Enter your Name: ");
			String nn = input.nextLine();
			System.out.println("Enter Account Number: ");
			int num = input.nextInt();
			System.out.println("Enter Account Type: ");
			String type = input.next();
			System.out.println("Enter Initial Balance: ");
			int bal = input.nextInt();
			A b1 = new A(nn, num, type, bal);
			int menu;
			System.out.println("Menu");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Display Information");
			System.out.println("4. Exit");
			boolean quit = false;
			do {
				System.out.print("Please enter your choice: ");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					b1.deposit();
					break;

				case 2:
					b1.withdraw();
					break;

				case 3:
					b1.display();
					break;

				case 4:
					quit = true;
					break;
				}
			} while (!quit);
		}
	}