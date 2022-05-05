package com.collection.list;

public class Employee {
	
	int id;
	int Salary;
	String Name;
	
	public Employee(int id,int Salary,String Name){
		
		this.id=id;
		this.Salary=Salary;
		this.Name=Name;
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Salary=" + Salary + ", Name=" + Name + "]";
	}
	
	public int getid() {
        return id;
    }
	
	public int getSalary() {
        return Salary;
    }
	
	public String getName() {
        return Name;
    }


}
