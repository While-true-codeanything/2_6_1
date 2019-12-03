
public class Person {

protected int age;
protected String name;
public Person(String s, int a) {
	this.age=a;
	this.name=s;
}
public String getName() {
	return this.name;
}
public int getAge() {
	return this.age;
}
public void setName(String s) {
	this.name=s;
}
public void setAge(int a) {
	this.age=a;
}

public String toString() {
	return("("+this.name+", "+this.age+")");
}
public String work(){
	return "None";
}
public static void main(String[] args) {
	Person p = new Person("Test", 3);
	System.out.println(p);
	p.setAge(5);
	p.setName("Vasya");
	System.out.println(p);
	System.out.println(p.work());
	Employee e = new Employee("1", 2, "3");
	System.out.println(e);
	System.out.println(e.work());
	}
}
