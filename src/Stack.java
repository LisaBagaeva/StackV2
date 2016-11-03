package Stack;

import LinckedListV2.LinckedListV2;
import LinckedListV2.Node;

public class Stack<E> {
	private int size;
	private LinckedListV2<E> elementData = new LinckedListV2<>();
	private Node<E> top;

	public Stack() {}

	public void push(E element) {
		elementData.add(element);
		top = elementData.getFLast();
		size++;
	}

	public void pop() {
		top = elementData.getFLast().getPrev();
		elementData.remove(elementData.getFLast().getValue());
		size--;
	}

	public E peek() {
		return top.getValue();
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
		return size;
	}
}
