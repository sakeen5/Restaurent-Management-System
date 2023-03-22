package classes;

import java.lang.*;
import interfaces.*;

public class Employee{
	protected String name ;
	protected String empid ;
	protected double salary ;

	public void setName(String name){this.name = name ;}
	public void setEmpid(String empid){this.empid = empid ;}
	public void setSalary(double salary){this.salary = salary ;}

	public String getName(){return name ;}
	public String getEmpid(){return empid ;}
	public double getSalary(){return salary ;}

	
}