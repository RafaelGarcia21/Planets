public class TesShoppingCart 
{
public static void main(String[] args) {

	Item [] items = new Item[10];
 for (int i = 0; i < items.length; i++){
	 	double price = (int)(Math.random()*100);
	 		items[i] = new Item((float)price);
}
ShoppingCart sc = new ShoppingCart(items);
System.out.println("Subtotal: " + sc.subTotal());
System.out.println("Total: " + sc.total());
System.out.println("Tax: " + (sc.total() - sc.subTotal()));
}
}
