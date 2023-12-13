package com.collectionMasterAssignment;

import java.util.Objects;

public class EmployeeDetail {
	private int emp_id;
	private String emp_name;
	private int emp_salary;
	EmployeeDetail()
	{
		
	}
	EmployeeDetail(int emp_id ,String emp_name ,int emp_salary)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public int getEmp_id()
	{
		return emp_id;
	}
	public void setEmp_name(String emp_name)
	{
		this.emp_name=emp_name;
	}
	public String getEmp_name()
	{
		return emp_name;
	}
	public void setEmp_salary(int emp_salary)
	{
		this.emp_salary=emp_salary;
	}
	public int getEmp_salary()
	{
		return emp_salary;
	}
	
	//for eight
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(emp_id, emp_name, emp_salary);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EmployeeDetail other = (EmployeeDetail) obj;
//		return emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name) && emp_salary == other.emp_salary;
//	}
	
	//for  ThirteenQuestion
	 @Override
    public int hashCode() {
        // Using hash code of emp_id, emp_name, and emp_salary for uniqueness
        int result = Integer.hashCode(emp_id);
        result = 31 * result + emp_name.hashCode();
        result = 31 * result + Double.hashCode(emp_salary);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EmployeeDetail employee = (EmployeeDetail) obj;

        // Comparing employees based on emp_id, emp_name, and emp_salary
        return emp_id == employee.emp_id &&
               emp_name.equals(employee.emp_name) &&
               Double.compare(employee.emp_salary, emp_salary) == 0;
    }
	 
	@Override
	public String toString()
	{
		return "Detail :[\nemp_id=" + emp_id +
				"\nemp_name=" + emp_name +
				"\nemp_salary=" + emp_salary + "]";
	}
	
}
