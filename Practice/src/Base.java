class Super {
	
	public String m(){
		return "Superh";
	}
}
	class Sub extends Super{
		//Overrides
		public String y(String s){
			return "Sub";
		}
}
	public class Base {
		public static void main(String [] args){
			Sub sub = new Sub();
			Super sup = new Super();
			System.out.println(sub.m());
			System.out.println(sup.m());
		}
}
