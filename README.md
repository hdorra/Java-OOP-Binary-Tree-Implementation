# Java OOP Binary Tree Implementation #
This assignment was completed as part of graduate coursework.
</br>

**Overview:**</br>
1. ***Node.java***</br>
This is an interface for a Node in a binary tree.
The following operations are supported by the tree:
    * Insert - Inserts a value into the binary tree. If the value is greater than the value stored in this node, insert it into the rightChild. If the value is less than or equal to the value stored in this node, inserts it into the leftChild.
    * Contains - This checks if any nodes, including the node it is called on, contains the specified number (returns true if this node or any of its children have that value).</br>
    * Sum - Returns the sum of the values stored in this node and all of its children. </br>
    * Average - Returns the average of the values stored in this node and all of its children.</br>
    * Size - Returns the total number of nodes, including this one, stored from this point in the tree and below.</br>

2. ***NullNode.java***</br>
Supports these operations:</br>
   * Insert - Creates a new CompositeNode with the specified value and causes the NullNode to ask its parent to replace the NullNode with the newly created CompositeNode that contains the value. The NullNode will be "replacing itself on demand" to create a CompositeNode and add it to the tree. </br>
   * Contains - Method should always returns false.</br>
   * Sum - sum() is always 0.</br>
   * Average - average() is always 0.</br>
   * Size     - size() is always 0.</br>
   * Replace  - replace() method does nothing.</br>
   * Children - getLeftChild() and getRightChild() methods always return null.</br>
   * Parent   - getParent() method returns the value that the parent member variable is currently set to.</br>
   * Value    - setValue() in NullNode throws a java.lang.UnsupportedOperationException if it is invoked and getValue() always returns 0.0</br>

3. ***CompositeNode.java:***</br>
   * Insert - Inserts a value into the binary tree. If the value is greater than the value stored in this node, insert it into the rightChild. If the value is less than or equal to the value stored in this node, inserts it into the leftChild.
   * Contains - This checks if any nodes, including the node it is called on, contains the specified number (returns true if this node or any of its children have that value).</br>
   * Average  - Returns the average of the values stored in this node and all of its children.</br>
   * Size     - Returns the total number of nodes, including this one, stored from this point in the tree and below.</br>
   * Replace  - Compares the passed in "child" variable to the "leftChild" and "rightChild" member variables. Whichever one of these variables matches the 
		"child" variable that is passed in, sets the value of it to the "replacement" that is passed in.</br>
   * Children - getLeftChild() and getRightChild() methods return the corresponding member variables initialized to instances of NullNode on construction.
   * Parent   - getParent() method returns the value that the parent member variable is currently set to.
   * Value    - A member variable that is read/written by the getValue() / setValue() methods.



4. ***NodeFactory.java***</br>
Updated to return an instance of the CompositeNode and NullNode.




