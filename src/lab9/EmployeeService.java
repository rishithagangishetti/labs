package lab9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department(12,"rnd",112);
		EmployeeRepositery e1=new EmployeeRepositery((Integer)2,"patrick","jane","jane@gmail.com","9880875123",LocalDate.of(2018, 1, 13),"analyst",(Double)40000.8,(Integer)112,d1);
		Department d2=new Department(13,"lnd",113);
		EmployeeRepositery e2=new EmployeeRepositery((Integer)3,"lisbon","Teresa","lisbon@gmail.com","98980875123",LocalDate.of(2018, 8, 13),"consultant",(Double)100000.8,(Integer)113,d2);
		Department d3=new Department(14,"marketing",114);
		EmployeeRepositery e3=new EmployeeRepositery((Integer)4,"carl","ray","calte@gmail.com","9880905123",LocalDate.of(2010, 7, 13),"senior analyst",(Double)60000.8,(Integer)114,d3);
		Department d4=new Department(15,"finance",115);
		EmployeeRepositery e4=new EmployeeRepositery((Integer)5,"kim","jane","kim@gmail.com","9880890123",LocalDate.of(2008, 1, 13),"analyst",(Double)49010.8,(Integer)115,d4);
		Department d5=new Department(16,"dev",116);
		EmployeeRepositery e5=new EmployeeRepositery((Integer)6,"lee","june","june@gmail.com","9800875123",LocalDate.of(2018, 1, 10),"consultant",(Double)140000.8,(Integer)116,d5);
		EmployeeRepositery e6=new EmployeeRepositery((Integer)6,"sung","june","june@gmail.com","9800875123",LocalDate.of(2018, 1, 10),"consultant",(Double)140000.8,(Integer)116,d5);
		System.out.println(e1);
		ArrayList<EmployeeRepositery> emp=new ArrayList<EmployeeRepositery>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		List<Double> a= emp.stream().map(a1->a1.getSalary()).collect(Collectors.toList());
		System.out.println(a);
		
	}

}
