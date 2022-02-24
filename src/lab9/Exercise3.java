package lab9;
interface Inf3
{
	boolean validate(String uname,String pwd);
}
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inf3 v= (name,password)->
		{
			if(name.equals("jack") && password.equals("jack@123"))
				return true;
			return false;
				
		};
		if(v.validate("aeio", "wert"))
		{
			System.out.println("valid username and password");
		}
		else
		{
			System.out.println("Invalid username and password");
		}
		
		

	}

}
