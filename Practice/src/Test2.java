public class Test2 { 
			public static void main (String [] args){ 
				
				new Person().printPerson(); 
				new Student().printPerson(); 
				}
			}
	class Student extends Person{ 
		
		public String getInfo()
		{ return "Student"; 
		} 
	}
	class Person { 
		public String getInfo(){
			
		return "Person"; 
		} 
		public void printPerson()
		{ System.out.println(getInfo()); 
			
		} 
	}