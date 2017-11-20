/**
 *  This is an example of toString
 * @author rafael
 *
 */
public class gar {
	
	private int month;
	private int day;
	private int year;
	
	public gar(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
	} 
	//Using the two string method
	public String toString(){
		
		return String.format("%d/%d/%d", month, day,year);
	
	}

	public static void main(String[] args) {
		
		gar ob = new gar(4,5,6);
	}

}
