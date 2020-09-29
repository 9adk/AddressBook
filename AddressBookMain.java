import java.util.*;
public class AddressBookMain{
	
	public List<Contact> Book = new ArrayList<Contact>();	
	
	public List<Contact> addContact(Contact c) {
		Book.add(c);
		return Book;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		AddressBookMain addBookMain = new AddressBookMain();
		
		System.out.println("Enter the details of person");
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		System.out.println("Enter the address");
		String address = sc.nextLine();
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		System.out.println("Enter the state name");
		String state = sc.next();
		System.out.println("Enter the ZIP code");
		String zip = sc.next();
		System.out.println("Enter the phone number");
		long phoneNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the email");
		String email = sc.nextLine();
		Contact c = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
		addBookMain.addContact(c);

	}
}