package javatutorial;

public class MyFirstClass {

 int salary;
String name;
String info;

public void getselary() {
	salary= 9000;
	name= " Anik ";
	info= "123-33-7788";
	System.out.println(salary+name+info);
}
public void getaddress()
{String Address= "211 ocean parkway #1";
	
System.out.println(Address);
}	
public void getname() {
	salary= 8000;
	name =" ASH ";
	info="522-66-9878";
	System.out.println(salary+name+info);
}
public void getinfo() {
	salary=8500;
	name=" Imon ";
	info="123-55-5353";
	System.out.println(salary+name+info);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstClass obj =new MyFirstClass();
		obj.getname();
		obj.getselary();
		obj.getinfo();
		obj.getaddress();
	}

}
