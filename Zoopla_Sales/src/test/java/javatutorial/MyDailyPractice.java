package javatutorial;

public class MyDailyPractice {
	
	static String name = "Tawhid";
	int num = 45;
 
	public   void getinfo  (String firstName, int num) { 
	System.out.println(firstName + num);	
	}
	
	public void getname() {
		String name= "Sumaya";
	}
	
	public void getImonInfo () {
		
	}
	
	public String getSumayaInfo () {
		return name;
		
	}
	public void getAge( int age){
		
	}
	 
	public int getSahabInfo (int num) { 
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyDailyPractice result= new MyDailyPractice ();

	result.getinfo(null, 0);
	}

	
}
