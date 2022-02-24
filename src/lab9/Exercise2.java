package lab9;

interface Inf2
{
	String addSpace(String a);
}
//calculate power
public class Exercise2 {
	static String s=" ";
public static void main(String[] args)
{
	Inf2 p=(a1)->{
		
		for(int i=0;i<a1.length()-1;i++)
		{
			s=s+a1.charAt(i)+" ";
		}
		s=s+a1.charAt(a1.length()-1);
		return s;
	};
	System.out.println("The final string is" +p.addSpace("cg"));
}
}
