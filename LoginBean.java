package model;

public class LoginBean {
	
	private static String email, password;
	
	public static String getEmail ()
	{
		return email;
	}
	public static void setEmail (String _email)
	{
		email = _email;
	}
	
	public static String getPassword ()
	{
		return password;
	}
	public static void setPassword (String _password)
	{
		password = _password;
	}
	

	
	public boolean validatelogin(String _email, String _password)
	{
		boolean invalid=false;
		
		if ( _email.equals("admin@admin.com") && _password.equals ("admin"))
		{
		
		return invalid;
	}
		else
		{
		invalid=false;
		}
		return invalid;
		
		}
	

}
