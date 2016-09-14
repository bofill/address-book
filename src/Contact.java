
public class Contact {
	
	public String name;
	public String email;
	public String phoneNumber;

	
	public Contact (String name, String email, String phoneNumber){
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	public void printContacts (){
		System.out.println(name + "\t\t" + email + "\t\t" + phoneNumber);
	}
}