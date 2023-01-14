
public class CompositeNode implements Node {
	//initialized to instances of null node (the left and right child)
	
	private Node leftChild = new NullNode(); 
	private Node rightChild = new NullNode(); 
	
	public CompositeNode(){
		   leftChild.setParent(this);
		   rightChild.setParent(this);
		}

	private Double value = 0.0;// Added member variable to store the value
	Node parent = null;
	
	
	@Override
	public void setParent(Node n) {
		this.parent = n;
	}
	
	@Override
	public Node getParent() {
		return this.parent; //created field type parent in this node (on top)

	}

	@Override
	public void replace(Node child, Node replacement) {
		
		Node leftChild = getLeftChild();
		Node rightChild = getRightChild();

		boolean leftTest = leftChild.equals(child);
		boolean rightTest = rightChild.equals(child);
		
		 if (leftTest == true) {
			 replacement.setParent(this);
			 this.leftChild = replacement;
			    
		 } 
		 
		 if (rightTest == true){ 
			  replacement.setParent(this);
			  this.rightChild = replacement;
			}
		 
		 //System.out.println("Left comparison:" + leftTest);
		 //System.out.println("Right comparison:"+ rightTest);
		 //System.out.println("leftChild:"+ leftChild);
		 //System.out.println("rightChild:"+ rightChild);
		 //System.out.println("child:"+ child);
		 //System.out.println("replacement:"+ replacement);
		 //System.out.println("newRightChild:"+ newRightChild);
		 //System.out.println("newLeftChild:"+ newLeftChild);
			 
	}

	@Override
	public Node getLeftChild() {
		return this.leftChild;
	}

	@Override
	public Node getRightChild() {
		return this.rightChild;
	}

	@Override
	public void setValue(Double d) {
		this.value = d;
	}

	@Override
	public Double getValue() {
		return this.value;
	}

	@Override
	public Double sum() {
	
		double sum=0.0;
		double sumLeft = leftChild.sum(); // This gets the *sum* including that child
		double sumRight = rightChild.sum(); // This gets the *sum* including that child
		double thisSum = this.getValue();

		sum = sumLeft + sumRight + thisSum;
		
		System.out.println("sumLeft:"+ sumLeft);
		System.out.println("sumRight:"+ sumRight);
		System.out.println("thisSum:"+ thisSum);
		System.out.println("sum:"+ sum);
		
		return sum;
	}

	@Override
	public Double average() {
		return this.sum() / this.size(); 
 	 
	}

	@Override
	public int size() {
		int count=0;
		
		Node left = leftChild.getLeftChild();//to check what is coming back
		Node right = rightChild.getRightChild();//to check what is coming back
		
		count = this.leftChild.size() + this.rightChild.size() + 1; //Added a "1" for the current node
		
		System.out.println("Count " + count);
		System.out.println("LeftSize " + this.leftChild.size());
		System.out.println("RightSize " + this.rightChild.size());
		System.out.println("LeftChild " + left);
		System.out.println("RightChild " + right);
		
		return count;
		
	    }
		     
	@Override
	public void insert(Double d) {
		if(d <= this.getValue()){
		      this.leftChild.insert(d);
		   }
		   else {
		      this.rightChild.insert(d);
		   }	
	}  
	
	@Override
	public boolean contains(Double value) {
		this.setValue(value);
		return true;
	}

}
