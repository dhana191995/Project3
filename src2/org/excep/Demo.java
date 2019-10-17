package org.excep;

public class Demo {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);	
		try{
			String s="Dhana";
			System.out.println(s.charAt(3));
			try{
				System.out.println(4/0);
			}
catch(NullPointerException e){
	System.out.println("dont divide by zero");
}
			finally{
				System.out.println("inner finally");
			}}
			catch(exception e){
				System.out.println("Null value");
			}
			finally{
				System.out.println("outer finally");}
		}
			
	}
	

}
