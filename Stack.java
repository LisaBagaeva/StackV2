package Stack;

import LinckedListV2.LinkedListV2;

public class Stack<E> {
	private LinkedListV2<E> elementData = new LinkedListV2<>();

	public Stack() {
	}

	public boolean push(E element) {
		return elementData.add(element);
	}

	public E pop() {
		E value = elementData.getLast().getValue();
		elementData.remove(elementData.getLast().getValue());
		return value;
	}

	public E peek() {
		return elementData.getLast().getValue();
	}

	/**
	 * 
	 * @param element
	 *            - T element
	 * @return number of pop() to the top
	 */
	public int search(E element) {
		if (elementData.getIndex(element) != -1)
			return elementData.size() - elementData.getIndex(element) - 1;
		else
			return -1;
	}

	public int getSize() {
		return elementData.size();
	}
}
