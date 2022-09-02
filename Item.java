/**
 * Generic class of item.
 * 
 * @author Zac Cowan
 * @version 08/15/2022
 * Fall/2022
 */
public class Item<T> {
	private T e;
	
	/**
	* Gets the value of the item
	* @return value of the item
	*/
	public T getE() {
		return e;
	}
	
	/**
	* Sets the value of the item
	* @param value value to store in item
	*/
	public void setE(T value) {
		e = value;
	}
}
