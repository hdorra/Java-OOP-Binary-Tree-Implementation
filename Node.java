
import java.util.List;

public interface Node {

    /**
     * @return
     */

    public Double sum();

    /**
     * @return
     */

    public Double average();

    /**
     * @return
     */

    public int size();

    /**
     * @param d
     */

    public void insert(Double d);

    /**
     * @param value
     * @return
     */

    public boolean contains(Double value);

    /**
     * @param d
     */

    public void setValue(Double d);

    /**
     * @return
     */

    public Double getValue();

    /**
     * @param n
     */

    public void setParent(Node n);

    public Node getParent();

    /**
     * @param child
     * @param replacement
     */

    public void replace(Node child, Node replacement);

    /**
     * @return
     */

    public Node getLeftChild();

    /**
     * @return
     */

    public Node getRightChild();

}
