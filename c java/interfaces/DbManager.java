public class DbManager{

	public static void SignupUser(String email, DbManagerInterface dbint){
		System.out.println("SignupUser called")
	}

	public static interface DbManagerInterface{
		public void onComplete();
		public void onError();
	}
}

public class AuthManager{
	
}