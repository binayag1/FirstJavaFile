
public class Storage {
	String name;
	int hours;
	int salary;
	
	
	public Storage(String name,int hours, int salary) {
		this.name = name;
		this.hours=hours;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours() {
		this.hours=hours;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Storage [name=" + name + ",hours=" + hours + " salary=" + salary + "]";
	}
	

}
