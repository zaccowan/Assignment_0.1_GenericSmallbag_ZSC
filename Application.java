
public class Application {
	public static void main(String[] args) {
		Item<String> itemString = new Item<String>();
		itemString.setE("Zachary Cowan");
		
		Item<Integer> itemInteger = new Item<Integer>();
		itemInteger.setE(7);
		
		SmallBag<Item<String>> smallBagString = new SmallBag<Item<String>>();
		smallBagString.setItem(itemString);
		System.out.println("String item: " + smallBagString.getItem().getE());
		
		SmallBag<Item<Integer>> smallBagInteger = new SmallBag<Item<Integer>>();
		smallBagInteger.setItem(itemInteger);
		System.out.println("Integer item: " + smallBagInteger.getItem().getE());
	}
}
