public class ShoppingCart {
	
	//Fields
	private Item [] items;
	private int numItems = 0;
	private static double taxRate = 0.05;


    //Methods
	public ShoppingCart(){
			this.items = new Item[10];//Array up to 10
	}
	public ShoppingCart(Item [] items){
			this();
		for (int i = 0; i < items.length; i++){
				addItem(items[i]);
		}
}
	public void setNumItems(int numItems){

		if (numItems > 0 && numItems < 10){
		this.numItems = numItems;
	}
}
	public static void setTaxRate(double taxRate){
		
		ShoppingCart.taxRate = taxRate;
}
	public int getNumItems(){
		return numItems;
	}
	public static double getTaxRate(){
		return taxRate;
}
	public boolean addItem(Item it)
{
		boolean full = false;
		if (numItems < 10 && it != null)
		{
			items[numItems] = it;
			numItems++;
			full = true;
}
		return full;
}
	public float subTotal()
{
float total = 0;
for (int i = 0; i < items.length; i++)
{
total += items[i].getPrice();
}
return total;
}
public float total()
{
float total = 0;
total = (1 + (float)taxRate)*subTotal();
return total;
}
}
class Item
{
private double price;
public Item(double price)
{
this.price = price;
}
public double getPrice()
{
return price;
}
}
