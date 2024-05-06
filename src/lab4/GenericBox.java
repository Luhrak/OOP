package lab4;

public class GenericBox<T> {

	private Object[] items;
	private int count = 0;

	// Constructor - Bekommt number und erstellt object array damit
	public GenericBox(int number) {
		this.items = new Object[number];
	}

	// packt [was auch immer T sein wird] in den object array, count++
	public void add(T item) {
		this.items[this.count] = item;
		this.count++;
	}

	// Wird als T array object gecasted
	@SuppressWarnings("unchecked")
	public T getItem(int index) {
		return (T) this.items[index];
	}

}
