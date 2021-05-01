
public class UserManager {
	
	public void addMultipleUser(User [] users) {
		
		for (User user : users) {
			System.out.println(user.firstName + " eklendi.");
		}
		
	}
}
