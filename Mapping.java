
public class Mapping<T, E> {
	
	private T t;
	private E e;
	
	public T getIdentifier() {return t;}
	public void setIdentifier(T t) {this.t=t;}
	
	public E getValue() {return e;}
	public void setValue(E e) {this.e=e;}
	
}
