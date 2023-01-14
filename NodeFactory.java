
public class NodeFactory {

    public Node newNode(Double v){
        return newCompositeNode(v);
    }

    /**
     * @return
     */

    public Node newCompositeNode(Double v){
    	CompositeNode newCompositeNode = new CompositeNode();
    	newCompositeNode.setValue(v);
    	return newCompositeNode;
    }

    /**
     * @return
     */

    public Node newNullNode(){
    	return new NullNode();
    }
}
