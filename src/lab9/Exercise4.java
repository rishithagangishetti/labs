package lab9;
interface Intf4
{
	Student getDetails();
}
public class Exercise4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf4 std=Student::new;
		Student s=std.getDetails();
		s.setName("jack");
		s.setSid(12);
		System.out.println(s.sid);
		System.out.println(s.name);
		
		
	
	}

}
