package lab9;

import java.time.LocalDate;

public class EmployeeRepositery {
	Integer empoyeeId;
	String firstname;
	String lastName;
	String email;
	String phonenumber;
	LocalDate hireDate;
	String designation;
	Double salary;
	Integer managerId;
	Department department;
	public Integer getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(Integer empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeRepositery [empoyeeId=" + empoyeeId + ", firstname=" + firstname + ", lastName=" + lastName
				+ ", email=" + email + ", phonenumber=" + phonenumber + ", hireDate=" + hireDate + ", designation="
				+ designation + ", salary=" + salary + ", managerId=" + managerId + ", department=" + department + "]";
	}
	public EmployeeRepositery(Integer empoyeeId, String firstname, String lastName, String email, String phonenumber,
			LocalDate hireDate, String designation, Double salary, Integer managerId, Department department) {
		super();
		this.empoyeeId = empoyeeId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.phonenumber = phonenumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
