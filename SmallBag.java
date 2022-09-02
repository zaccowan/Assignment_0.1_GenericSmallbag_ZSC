/*
 * Generic class to store data in small bag.
 * 
 * @author Zachary Cowan
 * @version 08/15/2022
 * Fall/2022
 */
public class SmallBag<T> {
	
	private T item;
	
	/*
	* Gets the item stored in bag.
	* @return item stored in bag
	*/
	public T getItem() {
		return item;
	}
	
	/*
	* Sets the item stored in bag
	* @param value Item to store
	*/
	public void setItem(T value) {
		item = value;
	}
}
