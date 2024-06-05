//Creates and keeps track of employee info

public class Employee 
{
	private String name,job;
	private double salary;

	public Employee(String inname, String injob, double insalary)
    {
    	name = inname;
		job = injob;
		salary = insalary;
	}

	public String toString() 
	{   
		return ("Name: " + name + "\nJob: " + job + "\nSalary: " + String.format("$%,.2f",salary));
	}

	public String getName()
    {
    	return name;
	}

	public Double getSalary()
    {
    	return salary;
	}

	public void giveRaise(double raisePercent)
    {
    	salary=(salary * (1+raisePercent));
	}


}
