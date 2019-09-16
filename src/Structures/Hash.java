package Structures;

public class Hash<T> {
	
	public final static int BASE_SIZE = 9*3;
	
	private Node<T>[] A;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Hash(int s) {
		
		A = new Node[s];
		setSize(s);
		
	}
	
	@SuppressWarnings("unchecked")
	public Hash() {
		
		A = new Node[BASE_SIZE];
		setSize(BASE_SIZE);
		
	}
	
	public int position(int k) {
		return k%A.length;
	}
	
	public void add(int key, T obj) {
		
		Node<T> temp = null;
		int place = position(key);
		
		if(A[place] == null) {
			A[place] = new Node<T>(obj);
		}else {
			
			temp = A[place];
			boolean exit = false;
			
			while(!exit) {
				if(temp.getNext() == null) {
					temp.setNext(new Node<T>(obj));
					exit = true;
				}else {
					temp = temp.getNext();
				}
				
			}
			
		}
		
	}
	
	public void remove(int key) {
		//TODO
	}

	public int size() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Node<T> getObject(int k) {
		return A[k];
	}
	
}
