package javatutorial;

public class GlobalVariable {
	
	static String name;
	static long mynum;
	static double salary;
	
	public void getimoninfo() {
		
		 name= " imon ";
		 mynum =  9292904172l ;
		salary =  6000.75;
		
		System.out.println(name+ mynum+  salary);
		
	}
	
	public void getsahabinfo(){
		name=" sahab ";
		mynum=  3147778899l ;
		salary=   8000.00;
		System.out.println(name+ mynum+  salary);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GlobalVariable obj =new GlobalVariable();
	obj.getimoninfo();
	obj.getsahabinfo();
		
		


	}

}
