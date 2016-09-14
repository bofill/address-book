import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("How many contacts do you want to enter?");
		int arrayLength = scan.nextInt();

		Contact[] contacts = new Contact [arrayLength];

		scan.nextLine();

		for (int i = 0; i < arrayLength; i++){
			System.out.print("Enter Contact name: ");
			String name = scan.nextLine();
			System.out.print("Enter Contact email: ");
			String email = scan.nextLine();
			System.out.print("Enter Contact Phone Number: ");
			String phoneNumber = scan.nextLine();	

			Contact contact = new Contact (name, email, phoneNumber);

			contacts[i] = contact;

		}
		System.out.println("Contacts list:");
		System.out.println("Name\t\temail\t\tphone number");
		System.out.println("--------------------------------------------");
		for (Contact c: contacts){
			c.printContacts();
		}
		scan.close();
	}
}
