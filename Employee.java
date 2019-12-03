
public class Employee extends Person{
    String company;

	public Employee(String s, int a, String s2) {
		super(s, a);
		this.company=s2;
	}
	public String toString() {
		return("("+this.name+", "+this.age+", "+this.company+")");
	}
	public String work(){
		return "Manager";
	}

}
