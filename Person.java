package array;

public class Person {
String name;
int age;
public Person(String st, int i) {
	// TODO Auto-generated constructor stub
	this.name=st;
	this.age=i;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int hashCode()
{
	final int prime=32;
	int result=1;
	result=prime*result + age;
	result=prime*result + ((name==null) ? 0 : name.hashCode());
	return result;
}
public boolean equals(Object obj)
{
	if(this==obj) {
		return true;
	if(this==null)
		
	
}
}
