
public class NullNode implements Node {
	Node parent=null;

	public NullNode() {
	//this.parent=parent;	
	}
		
	@Override
	public void setValue(Double d) {
		throw new UnsupportedOperationException("Operation Not Supported", null);
		
	}

	@Override
	public Double getValue() {
		return 0.0;
	}

	@Override
	public void setParent(Node n) {
		this.parent = n;
	}

	@Override
	public Node getParent() {
		return this.parent;
	}

	@Override
	public void replace(Node child, Node replacement) {
	  return;
	}

	@Override
	public Node getLeftChild() {
		return null;
	}

	@Override
	public Node getRightChild() {
		return null;
	}

	@Override
	public Double sum() {
		double sum = 0.0;
		return sum;
	}

	@Override
	public Double average() {
		double average = 0.0;
		return average;
	}

	@Override
	public int size() {
		int size = 0;
		return size;
	}

	@Override
	public void insert(Double d) {
	    Node newNode = new CompositeNode();
		newNode.setValue(d);
		this.parent.replace(this, newNode); 
		
	}

	@Override
	public boolean contains(Double value) {
		return false;
	}

}
