class test{
	 
	 public void press(String s){
		 System.out.println(s);
		 
	 }


	
 }
 public class harbo extends test {
	@Override
	public void press(String s){
	 System.out.println("Systems OverHeated " + s);
	 
 }
	public static void main(String[] args) {
		
	harbo obj = new harbo();
	obj.press(".......................Standby");
	
		
	}

}

